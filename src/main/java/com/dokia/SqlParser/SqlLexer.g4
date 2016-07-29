lexer grammar SqlLexer;

@lexer::header {
	package com.dokia.SqlParser.converter;
}

OPT_SEMI_COLON 
	: ';' ;
COMMA 
	: ',' ;
LPARAN 
	: '(' ;
RPARAN 
	: ')' ;
LSQUARE
	: '[' ;
RSQUARE
	: ']' ;
ARITH_OPER
	: '+' | '-' | '*' | '/';
NEGTIVE
	: '-' ;
COMPARE_OPER
	: '<' | '>' ;
NOT	: N O T ;
EQUALS 
	: '=' ;
STAR 
	: '*' ;
SEP : S E P ;
PAGE
	: P A G E ;
OFFSET
	: O F F S E T ;
UNION 
	: U N I O N ;
AS	: A S ;
AND : A N D ;
OR	: O R ;
LIKE 
	: L I K E ;
IN	: I N ;
SELECT 
	: S E L E C T ;
FROM 
	: F R O M ;
WHERE
	: W H E R E ;
BETWEEN
	: B E T W E E N ;
ORDER
	: O R D E R ;
BREAK
	: B R E A K ;
GROUP
	: G R O U P ;
BY	: B Y ;
DURATION
	: D U R A T I O N ;
PERIOD
	: P E R I O D ;
LIMIT
	: L I M I T ;
ASC : A S C ;
DESC 
	: D E S C ;
ASCENDING
	: A S C E N D I N G ;
DESCENDING
	: D E S C E N D I N G ;
AGGREOPR
	: LONG_SUM | DOUBLE_SUM | HYPER_UNIQUE
	;
COUNT
	: C O U N T ;
LONG_SUM 
	: L O N G '_' S U M ;
DOUBLE_SUM 
	: D O U B L E '_' S U M ;
UNIQUE
	: U N I Q U E ;
HYPER_UNIQUE
	: H Y P E R '_' U N I Q U E ;
ON	: O N ;
JOIN
	: J O I N ;
LEFT_JOIN
	: L E F T '_' J O I N ;
RIGHT_JOIN
	: R I G H T '_' J O I N ;
HAVING
	: H A V I N G ;
THEN
	: T H E N ;
WHICH
	: W H I C H ;
CONTAINS
	: C O N T A I N S ;
SORT
	: S O R T ;
HINT
	: H I N T ;
INTERVAL
	: I N T E R V A L ;
MIN	: M I N ;
MAX : M A X ;
JAVASCRIPT
	: J A V A S C R I P T ;
INCLUDE
	: I N C L U D E ;

LONG 
	: NUM+ ;
FLOAT    
	: NUM* '.' NUM+;

ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
SINGLE_QUOTE_STRING
    :  '\'' (ESC_SEQ | ~('\\'|'\'') )* '\'' 
    ;
WS	: [ \t\r\n]+ -> skip ; 	

DATE_YEAR_MONTH_ONLY	
	: DATE_YEAR_ONLY '-' NUM NUM; 	

DATE 	
	: DATE_YEAR_MONTH_ONLY '-' NUM NUM; 	
	
DATE_HOUR
	: DATE 'T' NUM NUM; 	
	
DATE_HOUR_MIN
	:	 DATE_HOUR ':' NUM NUM; 	
	
DATE_HOUR_MIN_SEC
	:	 DATE_HOUR_MIN ':' NUM NUM; 	
	
DATE_HOUR_MIN_SEC_SUB
	:	 DATE_HOUR_MIN_SEC '.' NUM NUM NUM; 	

DATE_HOUR_MIN_SEC_SUB_TZ
	:	 DATE_HOUR_MIN_SEC_SUB ('+'|'-') NUM NUM ':' NUM NUM; 	

DATE_HOUR_MIN_SEC_SUB_UTC_TZ
	:	 DATE_HOUR_MIN 'Z'
	| 	 DATE_HOUR_MIN_SEC 'Z'
	| 	 DATE_HOUR_MIN_SEC_SUB 'Z'
	;

fragment A : 'A' | 'a';
fragment B : 'B' | 'b';
fragment C : 'C' | 'c';
fragment D : 'D' | 'd';
fragment E : 'E' | 'e';
fragment F : 'F' | 'f';
fragment G : 'G' | 'g';
fragment H : 'H' | 'h';
fragment I : 'I' | 'i';
fragment J : 'J' | 'j';
fragment K : 'K' | 'k';
fragment L : 'L' | 'l';
fragment M : 'M' | 'm';
fragment N : 'N' | 'n';
fragment O : 'O' | 'o';
fragment P : 'P' | 'p';
fragment Q : 'Q' | 'q';
fragment R : 'R' | 'r';
fragment S : 'S' | 's';
fragment T : 'T' | 't';
fragment U : 'U' | 'u';
fragment V : 'V' | 'v';
fragment W : 'W' | 'w';
fragment X : 'X' | 'x';
fragment Y : 'Y' | 'y';
fragment Z : 'Z' | 'z';

fragment NUM : ('0'..'9') ;

fragment DATE_YEAR_ONLY	
	: NUM NUM NUM NUM ;

fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;