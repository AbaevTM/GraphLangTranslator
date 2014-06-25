package test.java.by.bsuir.course3.yapis.graphLangTranslator.syntaxAnalysis;

import java.io.IOException;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.EntryPoint;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.errorHandling.exception.GraphLangSyntaxException;
import org.junit.Test;
import static org.junit.Assert.*;
import static test.java.by.bsuir.course3.yapis.graphLangTranslator.common.StringConstant.*;

public class SyntaxAnalyzerTest {

	public SyntaxAnalyzerTest(){
		
	}
	
	@Test(expected = GraphLangSyntaxException.class)
	public void testSyntaxError() throws GraphLangSyntaxException, IOException{
		EntryPoint.mainTest(new String[]{PATH_SYNTAX_ERROR_FILE_EXAMPLE.getText()});
	}
	
	@Test (expected = IOException.class)
	public void testWrongName() throws GraphLangSyntaxException, IOException{
		EntryPoint.mainTest(new String[]{PATH_CANNOT_OPEN_FILE_EXAMPLE.getText()});
	}
	
	@Test (expected = IOException.class)
	public void testShouldPassName() throws GraphLangSyntaxException, IOException{
		EntryPoint.mainTest(null);
	}
	
	@Test
	public void testOk() throws GraphLangSyntaxException, IOException{
		EntryPoint.mainTest(new String[]{PATH_OK_FILE_EXAMPLE.getText()});
		assertNotNull(EntryPoint.getGraphLangTranslator().getSyntaxAnalyzer().getTree());
	}
	
}
