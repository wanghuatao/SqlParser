parser grammar SqlParser;

options {
	language=Java;
	tokenVocab=SqlLexer;
}

@parser::header {
	package com.dokia.SqlParser.converter;
}

program
	: grandQuery
	;
	
grandQuery
	: queryStmnt
	;
	
queryStmnt
	:	SELECT id=ID 
		FROM table=ID
		WHERE whereClause
	;
	
whereClause
	: compareItem (join=(AND|OR) compareItem)*
	;

compareItem
	: equalItem
	| largerItem
	| lessItem
	;

equalItem
	: ID EQUALS (ID|LONG|FLOAT|SINGLE_QUOTE_STRING)
	;
largerItem
	:
	;
lessItem
	:
	;