                     grammar GraphLangGrammar;

  ////////////////////
 ////PARSER RULES////
////////////////////

document : function+ EOF;
// FUNCTIONS
function: functionHeader functionBody;
functionHeader : typeDefinition IDENTIFIER_WORD functionParametersSection;
functionParametersSection:  OPENING_BRACKET_WORD
                            ( variableDefenition (COMMA_WORD variableDefenition)* )?
                            CLOSING_BRACKET_WORD;
functionArgumentsSection:   OPENING_BRACKET_WORD
                            ( statement (COMMA_WORD statement)* )?
                            CLOSING_BRACKET_WORD;
functionBody :  OPENING_CURLY_BRACKET_WORD
                terminalStatement*
                returnStatement
                CLOSING_CURLY_BRACKET_WORD;
functionCall :  IDENTIFIER_WORD functionArgumentsSection;
//STATEMENTS
blockStatement :    OPENING_CURLY_BRACKET_WORD
                    terminalStatement*
                    (breakStatement | returnStatement) ?
                    CLOSING_CURLY_BRACKET_WORD;
terminalStatement:  (   ( functionCall |
                        variableAssignment |
                        variableInitialization ) SEMICOLON_WORD ) |
                    cycleOperator |
                    conditionalOperator |
                    blockStatement |
                    function 
                    ;
//CYCLE OPERATORS
cycleOperator : whileCycle | untilCycle | forCycle;
    whileCycle  :   WHILE_WORD OPENING_BRACKET_WORD
                    statement
                    CLOSING_BRACKET_WORD
                        blockStatement
                    ;
    untilCycle  :   blockStatement
                    UNTIL_WORD OPENING_BRACKET_WORD
                        statement
                        CLOSING_BRACKET_WORD
                    ;
    forCycle    :   FOR_WORD OPENING_BRACKET_WORD
                    forCondition
                    CLOSING_BRACKET_WORD
                        blockStatement;
        forCondition    :   preCondition SEPARATOR_WORD
                            condition   SEPARATOR_WORD
                            postCondition 
                        ;
            preCondition :  variableInitialization?
                         ;
            condition   :   statement
                        ;   
            postCondition:  terminalStatement? 
                         ;
//CONDITIONAL OPERATORS
conditionalOperator : ifOperator | switchOperator;
    ifOperator  :   IF_WORD OPENING_BRACKET_WORD
                        statement
                        CLOSING_BRACKET_WORD
                        blockStatement
                    (ELSE_WORD 
                        blockStatement)?
                    ;
    switchOperator: SWITCH_WORD OPENING_BRACKET_WORD
                        statement
                        CLOSING_BRACKET_WORD
                        OPENING_CURLY_BRACKET_WORD
                        (
                            OPENING_SQUARE_BRACKET_WORD
                            statement
                            CLOSING_SQUARE_BRACKET_WORD
                                blockStatement
                        )+
                        CLOSING_CURLY_BRACKET_WORD
                    ;
//VARIABLE ASSIGNMENT
variableAssignment  :   variable ( COMMA_WORD variable)* 
                        EQUAL_SIGN_WORD
                        statement ( COMMA_WORD statement)*                        
                    ;
variable    :  IDENTIFIER_WORD
               (
               OPENING_SQUARE_BRACKET_WORD
               ( INTEGER_NUMBER | variable )
               CLOSING_SQUARE_BRACKET_WORD
               )?
            ;
statement:  atom  #statementAtom 
            | OPENING_BRACKET_WORD statement CLOSING_BRACKET_WORD #statementBrackets 
            |   functionCall #statementFunctionCall 
            |   MINUS_WORD statement #unary
            |   OPENING_BRACKET_WORD  TYPE_WORD   CLOSING_BRACKET_WORD
                statement  #statementCast
            |   statement MULTIPLICATION_WORD statement #statementBinaryMultiplication
            |   statement DIVISION_WORD statement #statementBinaryDivision
            |   statement PLUS_WORD statement #statementBinaryPlus
            |   statement MINUS_WORD statement #statementBinaryMinus
            |   statement ( LESS_OR_EQUAL_WORD | LESS_WORD 
                          | GREATER_WORD 
                          | GREATER_OR_EQUAL_WORD ) 
                            statement #statementBinaryComparison
            |   statement ( EQUAL_WORD | NOT_EQUAL_WORD ) 
                            statement #statementBinaryComparisionEquating
            ;
atom : ( primitiveAtom | variable );   
primitiveAtom: STRING | REAL_NUMBER | INTEGER_NUMBER  | BOOLEAN_LITERAL | NULL_WORD;
breakStatement  :   BREAK_WORD SEMICOLON_WORD;
returnStatement : RETURN_WORD statement? SEMICOLON_WORD;
//VARIABLES
variableInitialization: variableDefenition ( EQUAL_SIGN_WORD statement)?;
variableDefenition  :   typeDefinition
                        (
                        OPENING_SQUARE_BRACKET_WORD
                        ( INTEGER_NUMBER | variable )?
                        CLOSING_SQUARE_BRACKET_WORD
                        )?
                        IDENTIFIER_WORD                        
                    ;
typeDefinition : TYPE_SPECIFIER* TYPE_WORD;
                 
  ////////////////////
 ////LEXER RULES/////
////////////////////

//KEYWORDS

IF_WORD : 'if';
RETURN_WORD : 'return';
ELSE_WORD : 'else';
SWITCH_WORD : 'switch';
WHILE_WORD : 'while' ;
UNTIL_WORD : 'until';
FOR_WORD : 'for';
NULL_WORD : 'null';
BREAK_WORD : 'break';

//STATEMENTS
SEMICOLON_WORD : ';';
OPENING_BRACKET_WORD : '(';
CLOSING_BRACKET_WORD : ')';
OPENING_CURLY_BRACKET_WORD : '{';
CLOSING_CURLY_BRACKET_WORD : '}';  
OPENING_SQUARE_BRACKET_WORD : '[';
CLOSING_SQUARE_BRACKET_WORD : ']';  
COMMA_WORD : ',';
EQUAL_SIGN_WORD : '=';

//BINARY OPERATORS
PLUS_WORD : '+';
MINUS_WORD : '-';
MULTIPLICATION_WORD : '*';
DIVISION_WORD : '/';
SEPARATOR_WORD  :   '|';
GREATER_WORD : '>';
GREATER_OR_EQUAL_WORD : '>=';
LESS_WORD : '<';
LESS_OR_EQUAL_WORD : '<=';
EQUAL_WORD : '==';
NOT_EQUAL_WORD : '<>';

// BASIC CONSTRUCTIONS
BOOLEAN_LITERAL : TRUE_LITERAL | FALSE_LITERAL;
    TRUE_LITERAL : 'true';
    FALSE_LITERAL : 'false';
INTEGER_NUMBER  : NON_ZERO_DIGIT (ZERO_DIGIT | NON_ZERO_DIGIT)*  
                ;
REAL_NUMBER :   NON_ZERO_DIGIT (ZERO_DIGIT | NON_ZERO_DIGIT)* '.'
                (ZERO_DIGIT | NON_ZERO_DIGIT)+
            | ZERO_DIGIT
            ;
STRING : STRING_BRACKET 
         .*?
         STRING_BRACKET;
TYPE_WORD : INT_TYPE | 
            REAL_TYPE | 
            STRING_TYPE | 
            ARC_TYPE | 
            NODE_TYPE | 
            GRAPH_TYPE | 
            VOID_TYPE |
            BOOLEAN_TYPE;
TYPE_SPECIFIER: (GLOBAL_TYPE_SPEC | CONSTANT_TYPE_SPEC);
IDENTIFIER_WORD : LOWER_CASE_LETTER ( LOWER_CASE_LETTER | UPPER_CASE_LETTER 
                               | NON_ZERO_DIGIT | ZERO_DIGIT )*;

//TYPES
    //INTEGRAL TYPES
    VOID_TYPE : 'Void';
    BOOLEAN_TYPE : 'Boolean';
    INT_TYPE : 'Int';
    REAL_TYPE : 'Real';
    STRING_TYPE : 'String';
    ARC_TYPE : 'Arc';
    NODE_TYPE : 'Node';
    GRAPH_TYPE : 'Graph';
    
    //TYPE SPECIFIERS
    CONSTANT_TYPE_SPEC : '#';
    GLOBAL_TYPE_SPEC : '@';

//FRAGMENTS
fragment LINE_COMMENT_SYMBOL : '~~';
fragment MULTILINE_COMMENT_SYMBOL : '^^';
fragment UPPER_CASE_LETTER : [A-ZÀ-ß];
fragment LOWER_CASE_LETTER : [a-zà-ÿ];
fragment STRING_BRACKET : '"';
fragment NON_ZERO_DIGIT : [1-9];
fragment ZERO_DIGIT : '0';

//COMMENTS AND SKIPS
TRASH : [\n\r\t\f' ']+ -> channel(HIDDEN);
LINE_COMMENT : LINE_COMMENT_SYMBOL ~[\r\n]* -> channel(HIDDEN);
MULTI_LINE_COMMENT : MULTILINE_COMMENT_SYMBOL .*? 
                     MULTILINE_COMMENT_SYMBOL -> channel(HIDDEN);
