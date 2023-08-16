grammar edLang;

@header {
	import erro.Semantico;
	import estruturas.Simbolo;
	import estruturas.Tabelasimbolo;
	import estruturas.Variavel;
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varNome;
	private String _varValue;
	private Tabelasimbolo simboloTable = new Tabelasimbolo();
	private Simbolo simbolo;
	public void verificaID(String id){
		if(!simboloTable.exists(id)){throw new Semantico("SIMBOLO "+id+ " NÃO DECLARADO");}
	}
}


prog: 'programa' decl bloco 'fimdoprograma';
decl: (declaravariavel)+;
declaravariavel: tipo ID{_varNome = _input.LT(-1).getText();
						_varValue = null;
						simbolo = new Variavel(_varNome, _tipo, _varValue);
						if(!simboloTable.exists(_varNome)){simboloTable.add(simbolo);}else{throw new Semantico("SIMBOLO "+_varNome+ " JÁ DECLARADO");}}(VIRGULA ID{verificaID(_input.LT(-1).getText());})* PV;
						
tipo: 'numero'{_tipo = Variavel.NUMERO;} | 'texto'{_tipo = Variavel.TEXTO;};
bloco: (cmd)+;
cmd:cmdleitura | cmdescrita | cmdatribuicao;
cmdleitura: 'leia' AP ID {_varNome = _input.LT(-1).getText();if(!simboloTable.exists(_varNome)){throw new Semantico("SIMBOLO "+_varNome+ " NÃO DECLARADO");}} FP PV;

cmdescrita: 'escreva' AP ID{verificaID(_input.LT(-1).getText());} FP PV;
cmdatribuicao: ID{verificaID(_input.LT(-1).getText());} ATRIBUICAO expr PV;
expr: termo (OP termo)*;
termo: ID{verificaID(_input.LT(-1).getText());} | NUMERO;
ATRIBUICAO: '=';
VIRGULA: ',';
AP: '(';
FP: ')';
PV: ';';
OP: '+' | '-' | '*' | '/';
ID: [a-z]([a-z] | [A-Z] | [0-9]*);
NUMERO: [0-9]+ ('.' [0-9]+)?;
EB: (' ' | '\t' | '\n' | '\r'+) -> skip;
