package clubadmin;

import java.util.Map;

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

	public ActiveMember(Map<String, String> pMap) {
		super(pMap);
		// TODO Auto-generated constructor stub
	}

	public ActiveMember(String name, int age, String type) {
		super(name, age, type);
		
	}
	
	
	
	

}
