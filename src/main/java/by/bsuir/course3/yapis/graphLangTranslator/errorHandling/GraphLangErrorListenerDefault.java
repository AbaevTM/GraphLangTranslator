package main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling;

import java.util.BitSet;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class GraphLangErrorListenerDefault implements GraphLangErrorListener {

	private Logger logger;
	
	private ErrorObserver errorObserver;
	
	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3,
			boolean arg4, BitSet arg5, ATNConfigSet arg6) {
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2,
			int arg3, BitSet arg4, ATNConfigSet arg5) {
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2,
			int arg3, int arg4, ATNConfigSet arg5) {
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2,
			int arg3, String arg4, RecognitionException arg5) {
		logger.addSyntaxErrorMessage(arg4, arg2, arg3);
		errorObserver.errorOccurred();
	}

	@Override
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void setErrorObserver(ErrorObserver errorObserver) {
		this.errorObserver = errorObserver;
	}

}
