package test.java.by.bsuir.course3.yapis.graphLangTranslator.model.types;

import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeArc;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeBoolean;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeGraph;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeInt;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeNode;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeReal;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.TypeString;
import main.java.by.bsuir.course3.yapis.graphLangTranslator.output.types.exception.UndefinedOperationException;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTypesTest {

	public ModelTypesTest(){
		
	}
	
	@Test
	public void basicTypesTest() throws UndefinedOperationException{
		TypeInt int0 = new TypeInt();
		TypeInt int3 = new TypeInt(3);
		TypeInt int6 = new TypeInt(6);
		assertEquals((new TypeInt(2)).operatorEqual(new TypeInt(2)).getContent(), true);
		assertEquals(int6.operatorPlus(int3).operatorEqual(new TypeInt(9)).getContent(), true );
		assertEquals(int6.operatorMultiplication(int0).operatorEqual(new TypeInt(0)).getContent(), true);
		assertEquals(int0.operatorEqual( new TypeInt()).getContent(), true);
		assertEquals(int0.operatorEqual(int6).operatorEqual( TypeBoolean.instanceFalse()).getContent(), true);
		assertEquals(TypeBoolean.instanceTrue().operatorEqual( new TypeBoolean(true)).getContent(), true);
		TypeReal real5 = new TypeReal(5D);
		TypeReal real10 = new TypeReal(10D);
		assertEquals(true, real10.operatorDevision(real5).operatorEqual(new TypeReal(2D)).getContent());
		assertEquals(false, real10.operatorDevision(real5).operatorEqual(new TypeReal(10D)).getContent());
		TypeString string1 = new TypeString("a");
		TypeString string2 = new TypeString("b");
		assertEquals(string1.operatorPlus(string2).operatorEqual( new TypeString("ab")).getContent(), true);
	}
	
	@Test( expected = UndefinedOperationException.class)
	public void undefindeOperation1() throws UndefinedOperationException{
		TypeBoolean typeBoolean = new TypeBoolean();
		typeBoolean.operatorGreater(new TypeBoolean());		
	}
	
	@Test( expected = UndefinedOperationException.class)
	public void undefindeOperation2() throws UndefinedOperationException{
		TypeArc typeArc = new TypeArc();
		typeArc.operatorMinus(new TypeArc());		
	}
	
	@Test( expected = UndefinedOperationException.class)
	public void suchiiGraph() throws UndefinedOperationException{
		new TypeGraph().operatorMultiplication(null);	
	}
	
	@Test
	public void graphStructures() throws UndefinedOperationException{
		TypeNode nodeA = new TypeNode();
		TypeNode nodeB = new TypeNode();
		TypeNode nodeC = new TypeNode();
		TypeNode nodeD = new TypeNode();
		assertEquals(nodeA.operatorEqual(nodeC).getContent(), false);
		TypeArc arcAB = new TypeArc();
		arcAB.setFirstNode(nodeA);
		arcAB.setSecondNode(nodeB);
		TypeArc arcBC = new TypeArc();
		arcBC.setFirstNode(nodeB);
		arcBC.setSecondNode(nodeC);
		TypeArc arcCD = new TypeArc();
		arcCD.setFirstNode(nodeC);
		arcCD.setSecondNode(nodeD);
		TypeArc arcEqualCD = arcCD;
		assertEquals(arcEqualCD.operatorEqual(arcCD).getContent(), true);
		TypeGraph graph1 = new TypeGraph();
		TypeGraph graph2 = new TypeGraph();
		TypeGraph graph3 = new TypeGraph();
		graph1.addNode(nodeA);
		graph1.addNode(nodeB);
		graph1.addNode(nodeC);
		graph1.addNode(nodeD);
		graph2.addNode(nodeA);
		graph2.addNode(nodeB);
		graph2.addNode(nodeC);
		graph2.addNode(nodeD);
		graph1.addArc(arcAB);
		graph1.addArc(arcBC);
		graph1.addArc(arcCD);
		graph2.addArc(arcAB);
		graph2.addArc(arcBC);
		graph2.addArc(arcCD);
		assertEquals(graph1.operatorEqual(graph2).getContent(), true);
		assertEquals(graph1.operatorEqual(graph3).getContent(), false);
		graph3.addNode(nodeA);
		graph3.addNode(nodeB);
		assertTrue(graph3.getNodes().contains(nodeA));
		graph3.removeNode(nodeA);
		assertFalse(graph3.getNodes().contains(nodeA));				
	}
	
	
}
