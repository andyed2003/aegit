Machine changeMe

Variables var1, var2

Invariants
  @inv1 var1 ∈ ℕ
  @lkmj var2 ∈ ℕ

Events
  Event INITIALISATION
    then
      @act1 var1 ≔ 0
      @kuh var2 :∈ ℕ
  End

  Event evt1
    any q
    Where @grd1 q > 5 @jhh q < var1
    then
      @act1 var1 ≔ q + 1 @jyu var2 :∈ ℕ
  End
End