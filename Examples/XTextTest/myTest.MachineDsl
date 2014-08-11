Machine mach
{
	variables{
		Variable a{}, Variable b{}
	}
	
	invariants{
		theorem Invariant inv1{
			predicate "a::INT"
		}
		,
		theorem Invariant inv2{
			predicate "b: BOOL"
		}
	}
	
	events{
		Event evt1 {
			guards{
				theorem Guard grd1{
					predicate "a > 0"
				}
				,
				theorem Guard grd2{
					predicate "b = FALSE"
				}
			}
			actions{
				Action act1{
					action "a := a + 1"
				}
			}
		}
	}
	
}
	
 
		
 
 