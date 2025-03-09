package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testEuroToDollar() {
	    Conversions conversions = new Conversions();
	    
	    assertEquals(1.10, conversions.euroToDollar(1), 0.01);
	    assertEquals(110.0, conversions.euroToDollar(100), 0.01);
	    assertEquals(0.0, conversions.euroToDollar(0), 0.01);
	}
	
	@Test
	void testDollarToEuro() {
	    Conversions conversions = new Conversions();
	    
	    assertEquals(0.91, conversions.dollarToEuro(1), 0.01);
	    assertEquals(91.0, conversions.dollarToEuro(100), 0.01);
	    assertEquals(0.0, conversions.dollarToEuro(0), 0.01);
	}
	
	@Test
	void testStringToInteger() {
	    Conversions conversions = new Conversions();
	    
	    assertEquals(123, conversions.stringToInteger("123"));
	    assertEquals(-456, conversions.stringToInteger("-456"));
	    assertThrows(NumberFormatException.class, () -> conversions.stringToInteger("abc"));
	}
}
