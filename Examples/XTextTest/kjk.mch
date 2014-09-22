Machine changeMe 			// My comment

Variables var1 var2 		// Some variables

Invariants
@inv1 "var1 ∈ ℕ"
@lkmj "var2 ∈ ℕ"

Events
event INITIALISATION
then
@act1 "var1 ≔ 0"
@kuh "var2 :∈ ℕ"
end

event evt1 					// an event
any q
where @grd1 "q > 5" @jhh "q < var1"
then
@act1 "var1 ≔ q + 1" @jyu "var2 :∈ ℕ"
end

End