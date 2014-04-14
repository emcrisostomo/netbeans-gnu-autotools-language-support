/* 
 * Copyright (C) 2014, Enrico M. Crisostomo
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

grammar automake;

@header {
package org.netbeans.gnu.autotools.automake.antlr;
}

@lexer::members {
public boolean readTab = true;
}

/* Parser */

compilationUnit
    : (row)* unterminatedRow? EOF
    ;

row
    : NL
    | line NL
    ;

unterminatedRow
    : line
    ;

line
    : (ifstatement | target | recipe | variableAssignment | statement)
    ;

ifstatement
    : IF condition NL (row)+? elsestatement? ENDIF
    ;

condition
    : (.)+?
    ;

elsestatement
    : ELSE NL (row)+?
    ;

target
    : ID COLON prerequisiteList
    ;

prerequisiteList
    : (filename)*
    ;

filename
    : ID | variable
    ;

variableAssignment
    : variableName (ASSIGN | PLUSASSIGN | DEFINE) (.)*?
    ;

variableName
    : ID
    ;

variable
    : DOLLAR LPAREN variableName RPAREN
    | DOLLAR LBRACE variableName RBRACE
    ;

recipe
    : TAB recipeText
    ;

recipeText
    : (.)*?
    ;

statement
    : any
    ;

any
    : ( variable | .)+?
    ;

/* Lexer */

SINGLE_LINE_COMMENT
    : '##' ~[\r\n]* -> channel(HIDDEN)
    ;

STRING
    : '"' (ESC | .)*? '"' 
      { readTab = false; }
    ;

IF    : 'if'    { readTab = false; };
ELSE  : 'else'  { readTab = false; };
ENDIF : 'endif' { readTab = false; };

AM_VARIABLE
    : (LOWERCASE_LETTER | '_' )* '_' (UPPERCASE_LETTER)* 
      { readTab = false; }
    ;

ID
    : AM_LETTER (AM_LETTER_OR_DIGIT)*
      { readTab = false; }
    ;

fragment
AM_LETTER
    : LETTER | [_]
    ;

fragment
AM_LETTER_OR_DIGIT
    : LETTER | DIGIT | [_]
    ;

fragment
LOWERCASE_LETTER
    : [a-z]
    ;

fragment
UPPERCASE_LETTER
    : [A-Z]
    ;

fragment
ESC
    : '\\' [btnr"\\]
    ;

DOLLAR:     '$'  { readTab = false; } ;
LPAREN:     '('  { readTab = false; } ;
RPAREN:     ')'  { readTab = false; } ;
LBRACE:     '{'  { readTab = false; } ;
RBRACE:     '}'  { readTab = false; } ;
PLUSASSIGN: '+=' { readTab = false; } ;
DEFINE:     ':=' { readTab = false; } ;
ASSIGN:     '='  { readTab = false; } ;
COLON:      ':'  { readTab = false; } ;

fragment
LETTER
    : [a-zA-Z]
    ;

fragment
DIGIT
    : [0-9]
    ;

ENL: '\\' NL { readTab = false; } -> channel(HIDDEN) ;
NL: ('\r')? '\n' { readTab = true; } ;
TAB
    : '\t' {readTab}?
    ;
HORIZONTAL_WHITESPACE
    : ([ \t\f\u000c]) 
      { readTab = false; } -> channel(HIDDEN)
    ;

ANY
    : (.)+?
      { readTab = false; }
    ;
