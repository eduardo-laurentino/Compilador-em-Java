// Generated from edLang.g4 by ANTLR 4.7.1

	import erro.Semantico;
	import estruturas.Simbolo;
	import estruturas.Tabelasimbolo;
	import estruturas.Variavel;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link edLangParser}.
 */
public interface edLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link edLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(edLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(edLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(edLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(edLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#declaravariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravariavel(edLangParser.DeclaravariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#declaravariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravariavel(edLangParser.DeclaravariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(edLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(edLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(edLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(edLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(edLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(edLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(edLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(edLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(edLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(edLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#cmdatribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdatribuicao(edLangParser.CmdatribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#cmdatribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdatribuicao(edLangParser.CmdatribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(edLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(edLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link edLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(edLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link edLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(edLangParser.TermoContext ctx);
}