Machine m1
Variables
 Variable a, Variable b
Invariants	
 Invariant inv1 notTheorem Predicate "a::INT" &  
 Invariant inv2 notTheorem Predicate "b: BOOL"
Events
 Event evt1 
 Guards 
  Guard grd1 notTheorem Predicate "a > 0" & 
  Guard grd2 notTheorem Predicate "b = FALSE"
 Actions
  Action act1 Action "a := a + 1"
 
 Event evt2
 Guards 
  Guard grd3 notTheorem Predicate "b=True" 
  Actions
  Action act3 Action "b:=FALSE" 
				
			
		
	
	

	
 
		
 
 