package clubadmin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SClubTest {
	
	private SClub sClub1, sClub2;
	private Member member;

	@Before
	public void setUp() throws Exception {
		
		sClub1= new SClub("FC05");
		member = new Member("Krautschneider", 25,"A");
		sClub2= new SClub("FC05",member);
		sClub1.addMember(member);
		sClub1.addMember(new Member("Bauer",30,"A"));
		sClub1.addMember(new Member("Lahm",35,"P"));
		
	}

	@Test
	public void testGetSingleMember() {
		assertEquals("Krautschneider",
				sClub2.getMember().getName());
	}
	
	@Test
	public void testMultyMembers1(){
		assertEquals(sClub1.memberCount(),3);
		Member foundMember = null;
		for (int i=0;i<sClub1.memberCount();i++){
			Member aMember = sClub1.getMember(i);
			if (aMember.getName().equals("Bauer")){
				foundMember = aMember;
			}
		}
		assertEquals(foundMember.getName(),"Bauer");
		assertEquals(sClub1.getMember("Bauer").getName(),
				"Bauer");
		assertEquals(sClub1.getAvrgAge(),30.0,1.E-20);
	}
	
	@Test
	public void testMultyMembers2(){
		assertTrue(sClub1.removeMember("Lahm"));
		assertFalse(sClub1.removeMember("Lahm"));
		assertEquals(sClub1.memberCount(),2);
		assertNull(sClub1.getMember("Lahm"));
		sClub1.listMembers();
	}
}

