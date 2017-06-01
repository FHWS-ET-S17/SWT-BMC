package clubadmin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SClubTest {
	
	private SClub sClub1, sClub2;
	private MemberIF member;

	@Before
	public void setUp() throws Exception {
		
		sClub1= new SClub("FC05");
		member = new ActiveMember("Krautschneider", 25);
		sClub2= new SClub("FC05",member);
		sClub1.addMember(member);
		sClub1.addMember(new ActiveMember("Bauer",30));
		sClub1.addMember(new PassiveMember("Lahm",35));
		
	}

	@Test
	public void testGetSingleMember() {
		assertEquals("Krautschneider",
				sClub2.getMember().getName());
	}
	
	@Test
	public void testMultyMembers1(){
		assertEquals(sClub1.memberCount(),3);
		MemberIF foundMember = null;
		for (int i=0;i<sClub1.memberCount();i++){
			MemberIF aMember = sClub1.getMember(i);
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
		sClub1.listMembers();
		assertTrue(sClub1.removeMember("Lahm"));
		assertFalse(sClub1.removeMember("Lahm"));
		assertEquals(sClub1.memberCount(),2);
		assertNull(sClub1.getMember("Lahm"));
		sClub1.listMembers();
	}
}

