package ac.soton.compositionmodel.emf.structure.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.basis.MachineRoot;
import org.eventb.core.seqprover.eventbExtensions.AutoTactics.FindContrHypsTac;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinDBException;

import ac.soton.composition.core.IComposedMachineRoot;
import ac.soton.composition.core.basis.ComposedMachineRoot;
import ac.soton.compositionmodel.core.compositionmodel.CombinedEventMachine;
import ac.soton.compositionmodel.core.compositionmodel.ComposedEvent;
import ac.soton.compositionmodel.core.compositionmodel.ComposedMachine;
import ac.soton.compositionmodel.core.compositionmodel.IncludedMachine;
import ac.soton.compositionmodel.core.compositionmodel.impl.ComposedMachineImpl;
import compositionStructure.CompositionStructure;
import compositionStructure.CompositionStructureFactory;
import compositionStructure.CompositionStructurePackage;
import compositionStructure.LeafComposedEvent;
import compositionStructure.LeafEvent;
import compositionStructure.impl.CompositionStructureFactoryImpl;
import compositionStructure.impl.CompositionStructureImpl;
import compositionStructure.impl.LeafComposedEventImpl;
import ac.soton.compositionmodel.emf.structure.utils.RodinToEMFConverter;

//ASSUMPTION: A MACHINE CAN ONLY REFINE ONE MACHINE --> FUNCTIONALITY TO BE ADDED LATTER ON
@SuppressWarnings("restriction")
public class CompositionModelGenerator {

	private ComposedMachine cm;
	private IEventBProject project;

	private HashMap<String, EventBElement> refinementStructureDown; //Maps an abstract machine to its refinement
	private HashMap<String, EventBElement> refinementStructureUp;
	private HashMap<String, CompositionStructure> existingStructures;
	
	private class Machine_Event{ //Structure for arguments. Necessary as events have no relation to the machine they belong to
		public Machine mac;
		public Event ev;
		public Machine_Event(Machine mac, Event ev){
			this.mac = mac;
			this.ev = ev;
			
		}
	}	
	
	
	public CompositionModelGenerator(ComposedMachineRoot cm) {
		super();
		try {
			this.cm = RodinToEMFConverter.loadComposedMachine(cm);
			project = cm.getEventBProject();
			project.getRodinProject().getRodinFiles();
			refinementStructureDown = new HashMap<String, EventBElement>(); 
			refinementStructureUp = new HashMap<String, EventBElement>();
			existingStructures = new HashMap<String, CompositionStructure>();
			calculateRefinementStructure();
		} catch (RodinDBException e) {
			e.printStackTrace();

		}
	}
//	public CompositionModelGenerator(ComposedMachine cm, IEventBProject project) {
//		super();
//		try {
//			this.cm = cm;
//			this.project = project;
//			project.getRodinProject().getRodinFiles();
//			refinementStructureDown = new HashMap<String, EventBElement>(); 
//			refinementStructureUp = new HashMap<String, EventBElement>(); 
//			existingStructures = new HashMap<String, CompositionStructure>();
//			calculateRefinementStructure();
//		} catch (RodinDBException e) {
//			e.printStackTrace();
//
//		}
//	}
	private CompositionModelGenerator(ComposedMachine cm, IEventBProject project ,HashMap<String, EventBElement> refinementStructureDown, HashMap<String, EventBElement> refinementStructureUp, HashMap<String, CompositionStructure> existingStructures){
		this.cm = cm;
		this.project = project;
		this.refinementStructureDown = refinementStructureDown;
		this.refinementStructureUp = refinementStructureUp;
		this.existingStructures = existingStructures;
	}
	
	/**Structures
	* Starting from a machine, finds the first Composed Machine Ancestor
	* @param m Machine to find Composed Machine ancestor
	*/
	private ComposedMachine findAncestorComposedMachine(Machine m){
		EventBElement ret;
		if(m.getRefinesNames().size() > 0){
			return findAncestorComposedMachine(m.getRefines().get(0));
		}
		else if( (ret = refinementStructureUp.get(m.getName())) != null){
			assert(ret instanceof ComposedMachineImpl);
			return (ComposedMachineImpl) ret;
		}
		return null;
	}
	
	
	/**
	* Starting from a machine, finds the first Composed Machine Descendant
	* @param m Machine to find Composed Machine descendant
	*/
	private ComposedMachine findDescendantComposedMachine(Machine m){
		EventBElement temp = refinementStructureDown.get(m.getName());
		if(temp == null) return null;
		else if (temp instanceof Machine) return findDescendantComposedMachine((Machine) temp);
		else{
			assert (temp instanceof ComposedMachine);
			return (ComposedMachine) temp;
		}
		
	}
	
	
	
	/**
	 * Retrieves all machines of the current project
	 * 
	 * @return List of machines of the current project (Machine or ComposedMachine)
	 * @throws RodinDBException
	 */
	private ArrayList<IInternalElement> getMachines() throws RodinDBException {
		ArrayList<IInternalElement> result = new ArrayList<IInternalElement>();
		for (IRodinElement element : project.getRodinProject().getChildren()) {
			if (element instanceof IRodinFile) {
				IInternalElement root = ((IRodinFile) element).getRoot();
				if (root instanceof IMachineRoot){
					result.add(root);
				}
				else if(root instanceof IComposedMachineRoot) {
					result.add(root);
				}
			}
		}
		return result;
	}
	
	/**
	 * Get Machine with name machineName that contains an event named eventName
	 * @param machineName
	 * @param eventName
	 * @return
	 */
	
	private Machine_Event getEMFMachineEvent(String machineName, String eventName){
		
		try {
			Machine mac;
			mac = RodinToEMFConverter.loadMachine((MachineRoot)project.getMachineFile(machineName).getRoot());

			Event[] evS = (Event[]) mac.getEvents().toArray();
			Event retEv = null;
			for(Event ev : evS){
				if(ev.getName().equals(eventName)){
					retEv = ev;
					break;				
				}
			}
			if(retEv == null) throw new Exception();
			return new Machine_Event(mac,retEv);
		} catch (RodinDBException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			System.err.println("No machine " + machineName + " with event " + eventName);
			e.printStackTrace();
			return null;
		}
	}
	

	private ArrayList<Machine> findLeavesFromComposedMachine(ComposedMachine m){
		try{
			ArrayList<Machine> leaves = new ArrayList<Machine>();
			IncludedMachine[] included = (IncludedMachine[]) m.getIncludes().toArray();
			for(IncludedMachine mac : included){
				Machine temp = RodinToEMFConverter.loadMachine((MachineRoot)project.getMachineFile(mac.getMachineName()).getRoot()); 
				leaves.addAll(findLeavesFromMachine(temp));
			}		
			return leaves;
		}catch(Exception e){
			e.printStackTrace();
			return null;

		}
	}

	private ArrayList<Machine> findLeavesFromMachine(Machine m){
		ArrayList<Machine> leaves = new ArrayList<Machine>();
		EventBElement refiningMac = refinementStructureDown.get(m.getName());
		if (refiningMac == null) {
				leaves.add(m);
		}
		else{
			if (refiningMac instanceof ComposedMachineImpl)
			{
				leaves.addAll(findLeavesFromComposedMachine((ComposedMachine)refiningMac));
			}
			else if(refiningMac instanceof MachineImpl){
				leaves.addAll(findLeavesFromMachine((Machine) refiningMac));	
			}		
		}
		return leaves;
		
	}
	
	private void calculateRefinementStructure(){

		try {
			ArrayList<IInternalElement> machines = this.getMachines();
			for(IInternalElement mac : machines)
			{
				if(mac instanceof IComposedMachineRoot){
					ComposedMachineImpl composedMachine = RodinToEMFConverter.loadComposedMachine((ComposedMachineRoot) mac);
					if(composedMachine.getRefinesNames()!= null && composedMachine.getRefinesNames().size() > 0){
						Machine refined = RodinToEMFConverter.loadMachine((MachineRoot)project.getRodinProject().getRodinFile(composedMachine.getRefinesNames().get(0) + ".bum").getRoot());
						
						refinementStructureUp.put(composedMachine.getName(), refined); 
						refinementStructureDown.put(refined.getName(), composedMachine);
					}
					IncludedMachine[] includedMacs = (IncludedMachine[]) composedMachine.getIncludes().toArray();
					for(IncludedMachine includedMac : includedMacs){
							refinementStructureUp.put(includedMac.getMachine().getName(), composedMachine);
					}
				}
				else if(mac instanceof IMachineRoot){
					MachineImpl machine = RodinToEMFConverter.loadMachine((MachineRoot) mac);
					if(machine.getRefines()!= null && machine.getRefines().size()>0){
						Machine refined = machine.getRefines().get(0);
						refinementStructureDown.put(refined.getName(), machine);
						refinementStructureUp.put(machine.getName(), refined );
					}
				}
			}
		} catch (RodinDBException e) {
			e.printStackTrace();
		}
	}
	
	private Machine_Event findAbstractEvent(Machine_Event macEv){	
		if(macEv.ev.getRefines() == null || macEv.ev.getRefines().size() == 0){
			if (refinementStructureUp.get(macEv.mac.getName()) instanceof ComposedMachineImpl){
				ComposedMachineImpl cm = (ComposedMachineImpl) refinementStructureUp.get(macEv.mac.getName()); 
				ComposedEvent[] compEvs = (ComposedEvent[]) cm.getComposesEvents().toArray();
				for(ComposedEvent ce : compEvs){
					CombinedEventMachine[] combEvs = (CombinedEventMachine[]) ce.getCombinesEvents().toArray();
					for(CombinedEventMachine combEv : combEvs){
						if(combEv.getEventName().equals(macEv.ev.getName()) && !combEv.getEventName().equals("INITIALISATION")){
							return findAbstractEvent(getEMFMachineEvent(cm.getRefinesNames().get(0), ce.getRefinesNames().get(0)));	
						}
					}
				}
				return macEv;
			}
			else
				return macEv;
		}

		else return findAbstractEvent(new Machine_Event(macEv.mac.getRefines().get(0), macEv.ev.getRefines().get(0)));
	}
	
	public CompositionStructure generateCompositionStructure() throws RodinDBException {
		
		if(cm == null) return null;
		if(existingStructures.get(cm.getName()) != null) return existingStructures.get(cm.getName()); 
		
		CompositionStructureFactory factory = new CompositionStructureFactoryImpl();
		CompositionStructureImpl result = (CompositionStructureImpl) factory.createCompositionStructure();
		result.eSet(CompositionStructurePackage.COMPOSITION_STRUCTURE__COMPOSED_MACHINE, cm);
		
		
 		ArrayList<Machine> leaves = findLeavesFromComposedMachine(cm);
 			
 		for(Machine leaf : leaves){
 			System.out.println("Leaf Machine --> " + leaf.getName() + " with " + leaf.getEvents().size() + " e" +
 					"" +
 					"vents.");
 		}
 		HashMap<String, ArrayList<LeafEvent>> leafComposedEventsMapping = new HashMap<String, ArrayList<LeafEvent>>();
 		int i = 0;

		for(Machine leaf : leaves){
			Event[] events = (Event[]) leaf.getEvents().toArray();
			for(Event event : events){
				Machine_Event abstractEvent = findAbstractEvent(new Machine_Event(leaf, event));
				LeafEvent leafEvent = factory.createLeafEvent();
				leafEvent.setMachine(leaf); leafEvent.setEvent(event); leafEvent.setMachineName(leaf.getName());
				leafEvent.setProjectName(project.getRodinProject().getElementName());
				leafEvent.setEventName(event.getName());
				if(leafComposedEventsMapping.get(abstractEvent.ev.getName()) == null)
				{
					ArrayList<LeafEvent> temp = new ArrayList<LeafEvent>();
					temp.add(leafEvent);
					leafComposedEventsMapping.put(abstractEvent.ev.getName(), temp);	
				}
				else{	
					leafComposedEventsMapping.get(abstractEvent.ev.getName()).add(leafEvent);
					i++;
				}
			}
			
		}
		
		System.out.println(i);
		ArrayList<LeafComposedEvent> leafComposedEvents = new ArrayList<LeafComposedEvent>();
		System.out.println("Size of key set --> " + leafComposedEventsMapping.keySet().size() + " on " + cm.getName());
		
		
		for (String refinedEvent : leafComposedEventsMapping.keySet()){
			
			LeafComposedEventImpl newComposedEvent = (LeafComposedEventImpl)factory.createLeafComposedEvent();

			ArrayList<LeafEvent> temp = new ArrayList<LeafEvent>();
			temp.addAll(leafComposedEventsMapping.get(refinedEvent));
			Machine_Event abs = findAbstractEvent(new Machine_Event(temp.get(0).getMachine(), temp.get(0).getEvent()));
			
			ArrayList<Event> temp2 = new ArrayList<Event>();
			temp2.add(abs.ev);
			newComposedEvent.eSet(CompositionStructurePackage.LEAF_COMPOSED_EVENT__COMPOSED_LEAF_EVENTS, temp);
			newComposedEvent.eSet(CompositionStructurePackage.LEAF_COMPOSED_EVENT__REFINES, temp2);
			leafComposedEvents.add(newComposedEvent);
		}

		
		result.eSet(CompositionStructurePackage.COMPOSITION_STRUCTURE__LEAF_COMPOSED_EVENTS, leafComposedEvents);
		
		
		existingStructures.put(cm.getName(), result);
		CompositionStructure generated;
		/********************Generate the composition structure for the ancestor cm****************************/
		ComposedMachine upCmpMc = findAncestorComposedMachine(RodinToEMFConverter.loadMachine((MachineRoot)project.getMachineFile(cm.getRefinesNames().get(0)).getRoot()));
		CompositionModelGenerator upGenerator = new CompositionModelGenerator(upCmpMc, project, refinementStructureDown, refinementStructureUp, existingStructures);
		ArrayList<CompositionStructure> upCompositionStructure = new ArrayList<CompositionStructure>();
		generated = upGenerator.generateCompositionStructure();
		
		if(generated != null)
			upCompositionStructure.add(upGenerator.generateCompositionStructure());
		
		result.eSet(CompositionStructurePackage.COMPOSITION_STRUCTURE__IMMEDIATE_ANCESTOR_CMPOSED_MCHS, upCompositionStructure);
		/******************************************************************************************************/
		
		
		/********************Generate the composition structure for the descendant cms*************************/
		ArrayList<CompositionStructure> downCompositionStructure = new ArrayList<CompositionStructure>();
		for(IncludedMachine includedMachine : cm.getIncludes()){
			Machine temp = includedMachine.getMachine();
			ComposedMachine downCmpMc = findDescendantComposedMachine(temp);
			CompositionModelGenerator downGenerator = new CompositionModelGenerator(downCmpMc, project, refinementStructureDown, refinementStructureUp, existingStructures);
			generated = downGenerator.generateCompositionStructure();
			if(generated != null)
				downCompositionStructure.add(downGenerator.generateCompositionStructure());
		}
		result.eSet(CompositionStructurePackage.COMPOSITION_STRUCTURE__IMMEDIATE_DESCENDANT_CMPOSED_MCHS, downCompositionStructure);
		/*******************************************************************************************************/
		
		
		
		
		
//		
//		CompositionModelGenerator upGenerator = new CompositionModelGenerator(findAncestorComposedMachine(cm.getRefines().get(0)), this.project);
//		ArrayList<CompositionStructure> temp = new ArrayList<CompositionStructure>();
//		temp.add(upGenerator.generateCompositionStructure());
//		result.eSet(ComositionStructurePackage.COMPOSITION_STRUCTURE__IMMEDIATE_ANCESTOR_CMPOSED_MCHS, temp);
//		
		
		return result;
	}
	

	
	
}
