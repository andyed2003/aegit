Machine aa
Variables a b c
Invariants
 @aa "a : NAT"
 @bb "b : BOOL"
 @cc theorem "a >= 0"
 @dd "c : 0..10"
 
Events 
event evt 
when
@hhh "a /= 0" 
@jjj "a := 0"
then 
@opui "b := false" 
end

event evt2 
any x 
where
@lll "x: INT"
@mmm "a = 0"
then
@nnn "b = TRUE"
@ppp "a:=x"
end

End
