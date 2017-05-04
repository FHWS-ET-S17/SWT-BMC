package firststage.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NTupelTest {
	
	private NTupel t1,t2,t3,t4;
	private Double dField[] = new Double[]{3.5, 4.5};

	@Before
	public void setUp() throws Exception {
		t1 = new NTupel(3);
		t2= new NTupel(new Double[]{3.5, 4.5});
		dField = new Double[]{3.5, 4.5};
		t3 = new NTupel(dField);
		t4 = new NTupel(dField);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTupDim() {
		assertEquals(3,t1.getTupDim());
		t1.setTupValues(new Double[]{3.5, 4.5});
		assertEquals(2,t1.getTupDim());
	}
	@Test
	public void testGetValueAtV1() {
		assertEquals(2,t2.getTupDim());
		assertEquals(3.5, t2.getValueAt(0), 0.0001);
		assertEquals(4.5, t2.getValueAt(1), 0.0001);
		assertNull(t2.getValueAt(-1));
		assertNull(t2.getValueAt(2));
		
		
	}
	
	@Test
	public void testGetValueAtV2() {
		// flexiblerer Test
		assertEquals(2,t2.getTupDim());
		assertNull(t2.getValueAt(-1));
		assertNull(t2.getValueAt(dField.length));
		for (int i=0; i<t3.getTupDim();i++){
			assertEquals(dField[i], t2.getValueAt(i), 0.0001);
		}	
	}
	
	@Test
	public void testAddMethod(){
		// Test der Add-Methode
		NTupel result = NTupel.add(t2, t3);
		for (int i=0; i<t2.getTupDim(); i++){
			assertEquals(dField[i]*2, result.getValueAt(i),1.0E-10);
		}
		
	}
	

}
