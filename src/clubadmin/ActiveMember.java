package clubadmin;

public class ActiveMember extends Member {
	
	private int contractTerm;

	public ActiveMember(String name, int age) {
		super(name, age, "active");
		
	}

	public int getContractTerm() {
		return contractTerm;
	}

	public void setContractTerm(int contractTerm) {
		this.contractTerm = contractTerm;
	}
	
	

}
