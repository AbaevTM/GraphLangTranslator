package main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.logging.Logger;

import org.antlr.v4.runtime.ANTLRErrorListener;

public interface GraphLangErrorListener extends ANTLRErrorListener {

	public void setLogger( Logger logger);
	
	public void setErrorObserver( ErrorObserver errorObserver);
	
}
