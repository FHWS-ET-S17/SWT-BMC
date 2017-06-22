package clubadmin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test() {
		Member m1 = new ActiveMember("Otto", 37);
		Member m2 = new ActiveMember(m1.createPMap());
		assertEquals("Otto", m2.getName());
		assertEquals(37, m2.getAge());
		assertEquals(m1.getType(), m2.getType());
		assertEquals("active", m2.getType());
		
	}

}
