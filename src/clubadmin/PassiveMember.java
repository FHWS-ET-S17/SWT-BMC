package clubadmin;

public class PassiveMember extends Member {
	
	private int nextAnniversary;

	public PassiveMember(String name, int age) {
		super(name, age, "passive");
	}

	public int getNextAnniversary() {
		return nextAnniversary;
	}

	public void setNextAnniversary(int nextAnniversary) {
		this.nextAnniversary = nextAnniversary;
	}
	
	

}
