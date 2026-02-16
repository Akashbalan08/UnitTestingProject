package unittestingdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Test
	void testadd() {
		Assertions.assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	void testdiv() {
		Assertions.assertEquals(2,calculator.div(4, 2));		
	}
	
	@Test
	void testdivZero() {
		IllegalArgumentException thrown = Assertions.assertThrows(
	            IllegalArgumentException.class, 
	            () -> calculator.div(4, 0)
	        );
	 Assertions.assertEquals("Cannot Divide by Zero", thrown.getMessage());
	}
	

	@Test
	void testcheckNumNegative() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals("Negative", calculator.checkNum(-1));
	}
	
	@Test 
	void testcheckNumZero() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals("Zero", calculator.checkNum(0));
	}
	
	@Test
	void testcheckNum() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals("Positive", calculator.checkNum(2));
	}	

}
