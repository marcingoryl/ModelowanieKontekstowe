grammar myowngrammar;
program   : 'start' statement+ 'stop';


statement : createModel | createParam | assingParamsWithModel | createEvent;

createModel    : 'model' NAME;
createParam    :  'param' NAME;
createEvent: 'event' NAME;
assingParamsWithModel    :  'createModelWithParams';


NAME     : [a-zA-Z0-9]+ ;

WS     : [ \n\t]+ -> skip;