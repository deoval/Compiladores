/* 
* A primeira seção da especificação vai até o primeiro %%,
* e consiste de código Java que é copiado ao pé da letra
*
*/
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

%%

/*
* A segunda seção vai até o próximo %%, e são diversos parâmetros
* de configuração, além de código Java copiado para o corpo da
* classe do analisador léxico
*
*/

%class Scanner          // nome da classe do analisador
%public                 // classe deve ser pública
%line                   // guarde número da linha em yyline
%column                 // guarde número da coluna em yycolumn
%function nextToken     // nome do método que vai fornecer um token
%type Token             // classe usado para tokens

// Código Java entre %{ e %} é copiado pro corpo da classe
// do analisador
%{ 

	public Scanner() { }

	public void input(String input) {
	    // inicializa entrada pro analisador
		yyreset(new StringReader(input));
	}
	
	public List<Token> tokens() throws IOException {
		List<Token> tokens = new ArrayList<Token>();
		Token tok = nextToken();
		while(tok.getTipo() != Token.EOF) {
			tokens.add(tok);
			tok = nextToken();
		}
		tokens.add(tok);
		return tokens;
	}

%}

//estados para comentario
%xstate COMMENT
%xstate COMMENTBLOCO

%%

/*
* A última seção contém as regras léxicas, cada regra é um
* par com uma expressão regular e um trecho de código Java
* entre { e }.
*
*/

// Espaços são ignorados
[ \r\n\t\f]    				{ }



// Inicia Comentário
[/][/]                  	{ yybegin(COMMENT); }
[/][*]                  	{ yybegin(COMMENTBLOCO); }

// Leitura interna ao comentário
<COMMENT> {
  [\r|\n|\r\n]              { yybegin(YYINITIAL); }
  // Todo o resto é ignorado, afinal é só um comentário
  .                    	    { }
}

<COMMENTBLOCO> {
  [*][/]                	{ yybegin(YYINITIAL); }
  // Todo o resto é ignorado, afinal é só um comentário
  .                    	{ }
  [ \r\n\t\f]           { }
}



/* Palavras Reservadas */
boolean      				{ return new Token(Token.BOOLEAN, yytext(), yyline, yycolumn); }
class      					{ return new Token(Token.CLASS, yytext(), yyline, yycolumn); }
extends      				{ return new Token(Token.EXTENDS, yytext(), yyline, yycolumn); }
public      				{ return new Token(Token.PUBLIC, yytext(), yyline, yycolumn); }
static      				{ return new Token(Token.STATIC, yytext(), yyline, yycolumn); }
void      					{ return new Token(Token.VOID, yytext(), yyline, yycolumn); }
main      					{ return new Token(Token.MAIN, yytext(), yyline, yycolumn); }
String      				{ return new Token(Token.STRING, yytext(), yyline, yycolumn); }
return      				{ return new Token(Token.RETURN, yytext(), yyline, yycolumn); }
int      					{ return new Token(Token.INT, yytext(), yyline, yycolumn); }
if      					{ return new Token(Token.IF, yytext(), yyline, yycolumn); }
else						{ return new Token(Token.ELSE, yytext(), yyline, yycolumn); }
while						{ return new Token(Token.WHILE, yytext(), yyline, yycolumn); }
System.out.println			{ return new Token(Token.PRINTLN, yytext(), yyline, yycolumn); }
length						{ return new Token(Token.LENGTH, yytext(), yyline, yycolumn); }
true      					{ return new Token(Token.TRUE, yytext(), yyline, yycolumn); }
false						{ return new Token(Token.FALSE, yytext(), yyline, yycolumn); }
this						{ return new Token(Token.THIS, yytext(), yyline, yycolumn); }
new							{ return new Token(Token.NEW, yytext(), yyline, yycolumn); }
null                        { return new Token(Token.NULL, yytext(), yyline, yycolumn); }


/* Operadores */
[!]							{ return new Token('!', yytext(), yyline, yycolumn); }
[=]							{ return new Token('=', yytext(), yyline, yycolumn); }
[=][=]						{ return new Token(Token.EQ, yytext(), yyline, yycolumn); }
[!][=]						{ return new Token(Token.NEQ, yytext(), yyline, yycolumn); }
[&][&]						{ return new Token(Token.AND, yytext(), yyline, yycolumn); }
[<]							{ return new Token('<', yytext(), yyline, yycolumn); }

[+]							{ return new Token('+', yytext(), yyline, yycolumn); }
[-]							{ return new Token('-', yytext(), yyline, yycolumn); }
[*]							{ return new Token('*', yytext(), yyline, yycolumn); }
[/]							{ return new Token('/', yytext(), yyline, yycolumn); }

[(]                     	{ return new Token('(', yytext(), yyline, yycolumn); }
[)]                     	{ return new Token(')', yytext(), yyline, yycolumn); }
[\[]                    	{ return new Token('[', yytext(), yyline, yycolumn); }
[\]]                    	{ return new Token(']', yytext(), yyline, yycolumn); }
[{]                     	{ return new Token('{', yytext(), yyline, yycolumn); }
[}]                     	{ return new Token('}', yytext(), yyline, yycolumn); }

[;]                     	{ return new Token(';', yytext(), yyline, yycolumn); }
[.]                     	{ return new Token('.', yytext(), yyline, yycolumn); }
[,]                     	{ return new Token(',', yytext(), yyline, yycolumn); }


	
// Identificadores e numerais
[a-zA-Z][a-zA-Z0-9_]*		{ return new Token(Token.ID, yytext(), yyline, yycolumn); }
[0-9]+						{ return new Token(Token.NUM, yytext(), yyline, yycolumn); }


// Regra para EOF
<<EOF>>      				{ return new Token(Token.EOF,"<<EOF>>", yyline, yycolumn); }

// Erros léxicos 
.            				{ throw new RuntimeException("erro léxico, linha: " + 
				               (yyline+1) + ", coluna : " + (yycolumn+1) + ", char: " + 
				               yytext()); }