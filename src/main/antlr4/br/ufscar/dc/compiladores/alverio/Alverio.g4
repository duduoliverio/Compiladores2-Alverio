grammar Alverio;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING:	'"' ( ~('"') )* '"';
WS: [ \t\n\r]->skip;

program: (entity | testcase)*;

entity: 'entity' name=ID '{'
   'id' ':' entityId=STRING
   ('events' ':' eventsId+=ID ( ',' eventsId+=ID )*)?
'}';

testcase: 'test-case' name=ID '{'
   'when' ':' condition
   'assert' ':' query
'}';

condition: element=ID '.' event=ID;

query: element=ID assertType;

assertType: 'is' 'class' className=STRING | 'is' 'visible';