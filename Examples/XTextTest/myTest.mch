Machine m1
Variables
 Variable a, Variable b
Invariants	
 Invariant inv1 notTheorem is "a::INT" &  
 Invariant inv2 notTheorem is "b: BOOL"
Events
 Event evt1 
 Guards 
  Guard grd1 notTheorem when "a > 0" & 
  Guard grd2 notTheorem when "b = FALSE"
 Actions
  Action act1 then "a := a + 1"
 
 Event evt2
 Guards 
  Guard grd3 notTheorem when "b=True" 
 Actions
  Action act3 then "b:=FALSE" || 
  Action act4 then "a := 0"
				
			
		
	
	

	
 
		
 
 