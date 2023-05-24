import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a  = 1234;
		int b  = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test //this line need to be added if not initialise will have error
	public void testSubtract() {
		//fail("Not yet implemented");
		int a  = 9876;
		int b  = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals (expected, actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a  = 900;
		int b  = 90;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 10;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a  = 9000;
		int b  = 9;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 81000;
		assertEquals (expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
