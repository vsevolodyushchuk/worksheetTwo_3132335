package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void testEuroToDollar() {
	    Conversions conversions = new Conversions();
	    
	    assertEquals(1.10, conversions.euroToDollar(1), 0.01);
	    assertEquals(110.0, conversions.euroToDollar(100), 0.01);
	}


}
