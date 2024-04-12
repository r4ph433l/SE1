package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import uebung1.RomanNumberTransformer;

class TestRomanNumberTransformer {
	
	RomanNumberTransformer rnt = new RomanNumberTransformer();
    
    @Test
    void TestPositive() {
    	assertEquals(rnt.transformNumber(1), "I");
    	assertEquals(rnt.transformNumber(5), "V");
    	assertEquals(rnt.transformNumber(6), "VI");
    	assertEquals(rnt.transformNumber(123), "CXXIII");
    	assertEquals(rnt.transformNumber(1257), "MCCLVII");
    }
    
    @Test
    void TestNegative() {
    	assertEquals(rnt.transformNumber(0), "ERROR");
    	assertEquals(rnt.transformNumber(3001), "ERROR");
    }
}
