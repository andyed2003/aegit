Machine aa
Variables a, b, c
Invariants
 @aa is "a : NAT"
 @bb is "b : BOOL"
 @cc theorem  is "a >= 0"
 @dd is "c : 0..10"
 
Events
Event gg ordinary
any l
@ll when "l : NAT"
 

Event evt anticipated 
@hhh when "a /= 0" 
@jjj then "a := 0" 
@kkk then "b := false" 

Event evt2
any x 
@lll when "x: INT"
@mmm when "a = 0"
@nnn when "b = TRUE"
@ppp then "a:=x"
