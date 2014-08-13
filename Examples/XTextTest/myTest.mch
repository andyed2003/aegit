Machine m1
Variables
 a,  b
Invariants	
 @inv1 is "a:INT" 
 @inv2 is "b: BOOL"
Events
 Event evt1 
 @grd1 when "a > 0" 
 @grd2 when "b = FALSE"
 @act1 then "a := a + 1"
 
 Event evt2
 @grd3 when "b=True" 
 @act3 then "b:=FALSE"  
 @act4 then "a := 0"
				
			
		
	
	

	
 
		
 
 