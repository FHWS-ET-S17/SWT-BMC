package clubadmin;

public class Member {
	
	private String name;
	private int age;
	private String type; 

	public Member(String name, int age , String type) {
		super();
		this.name = name;
		this.age=age;
		this.type=type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
