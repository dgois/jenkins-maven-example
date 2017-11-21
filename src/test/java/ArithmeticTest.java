import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTest {
	
	@Test
	public void shouldSumTwoNumbers() throws Exception {
		Arithmetic arithmetic = new Arithmetic(1, 2);
		
		long actual = arithmetic.calculate("+");
		
		assertEquals(3, actual);
	}
        
        @Test
	public void shouldSubtractTwoNumbers() throws Exception {
		Arithmetic arithmetic = new Arithmetic(2, 2);
		
		long actual = arithmetic.calculate("-");
		
		assertEquals(0, actual);
	}
        
        @Test
	public void shouldMultiplyTwoNumbers() throws Exception {
		Arithmetic arithmetic = new Arithmetic(2, 2);
		
		long actual = arithmetic.calculate("*");
		
		assertEquals(4, actual);
	}
        
        @Test
	public void shouldDivideTwoNumbers() throws Exception {
		Arithmetic arithmetic = new Arithmetic(2, 2);
		
		long actual = arithmetic.calculate("/");
		
		assertEquals(1, actual);
	}
        
        @Test(expected = ArithmeticException.class)
	public void shouldThrowIllegalArgumentExceptionWhenDivideByZero() throws Exception {
		Arithmetic arithmetic = new Arithmetic(2, 0);
		
		arithmetic.calculate("/");
	}

}
