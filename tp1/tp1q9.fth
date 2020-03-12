\ Syntax to define a function ': <name> returned value ;'
\ Syntax to print '." something" CR'
\ FIXME-begin
: one 1 ." one " CR ;
: two 2 ." two " CR ;
\ FIXME-end
one two two one one -  + - + .