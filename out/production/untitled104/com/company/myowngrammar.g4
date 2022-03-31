grammar myowngrammar;
program   : 'start' statement+ 'stop';

statement : assign | assignatr | create;

assign    : 'let' ID 'be' (NUMBER | ID) ;
assignatr :  'atr' ATRNAME;
create    :  'create';



ID     : [a-zA-Z]+ ;
NUMBER : [0-9]+ ;
ATRNAME : [a-zA-Z0-9]+ ;
WS     : [ \n\t]+ -> skip;