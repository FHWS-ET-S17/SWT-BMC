package firststage.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NTupelTest {
	
	private NTupel t1;

	@Before
	public void setUp() throws Exception {
		t1 = new NTupel(3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(3,t1.getTupDim());
		t1.setTupValues(new Double[]{3.5, 4.5});
		assertEquals(2,t1.getTupDim());
	}
	@Test
	public void test2() {
		
	}

}
