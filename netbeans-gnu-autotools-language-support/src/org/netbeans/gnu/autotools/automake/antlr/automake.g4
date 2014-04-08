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
    : line NL
    | NL
    ;

unterminatedRow
    : line
    ;

line
    : (target | recipe | variableAssignment | statement)
    ;

target
    : ID ':' prerequisiteList
    ;

prerequisiteList
    : (filename)*
    ;

filename
    : ID | variable
    ;

variable
    : '$(' ID ')'
    | '${' ID '}'
    ;

recipe
    : '\t' recipeText
    ;

recipeText
    : (.)*?
    ;

variableAssignment
    : ID ('=' | '+=' | ':=') (.)*?
    ;

statement
    : any
    ;

any
    : (STRING | AM_VARIABLE | ID | DOLLAR | LPAREN | RPAREN | PLUSASSIGN | DEFINE | ASSIGN | COLON | TAB | ANY)+?
    ;

/* Lexer */

SINGLE_LINE_COMMENT
    : '##' ~[\r\n]* -> channel(HIDDEN)
    ;

STRING
    : '"' (ESC | .)*? '"' 
      { readTab = false; }
    ;

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
