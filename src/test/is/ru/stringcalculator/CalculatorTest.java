package is.ru.stringcalculator;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneString(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoString(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testThreeString(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testOneOver1000(){
		assertEquals(2, Calculator.add("1001,2"));
	}

	@Test
	public void testTwoOver1000(){
		assertEquals(0, Calculator.add("1002,2004"));
	}

}