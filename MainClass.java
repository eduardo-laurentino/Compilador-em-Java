import erro.Semantico;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MainClass {
	public static void main(String[] args) {
		try {
			edLangLexer lexer;
			edLangParser parser;

			lexer = new edLangLexer(CharStreams.fromFileName("input.txt"));

			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			parser = new edLangParser(tokenStream);
			parser.prog();
			System.out.println("\n\nCompilação bem Sucedida!");
		} catch (Semantico ex) {
			System.err.println("Erro Semântico - " + ex.getMessage());
		}

		catch (Exception ex) {
			System.out.println("ERROR" + ex.getMessage());
		}

	}

}
