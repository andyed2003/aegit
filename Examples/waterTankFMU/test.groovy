import spock.lang.Specification
import de.prob.scripting.Api

class WaterTankTest extends Specification {

    static Api api
    def ctrl

    def setup() {
      ctrl = api.b_load("/Users/bendisposto/Desktop/waterTank/waterTankCtrl.mch") as History 
      ctrl = ctrl.anyEvent(); // setup constants
      ctrl = ctrl.anyEvent(); // initialize machine
    }

    def "Initially the pump is turned off"() {
      expect:
       // This test will fail! The actual value is "TRUE"  
       assert ctrl.getCurrentState().value("pump") == "FALSE"
    }
    
    def "If we get below low level, the pump is turned on"() {
      when:
       ctrl = ctrl.fmiReadInputs("l=799") // set level < Low
       ctrl = ctrl.readLevel().decide().writePump() // decide
      then: 
       assert ctrl.getCurrentState().value("pump") == "TRUE"
    }
    
}

WaterTankTest.api = api
new WaterTankTest()

