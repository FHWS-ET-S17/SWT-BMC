package clubadmin;

public abstract class Member implements MemberIF {
	
	private String name;
	private int age;
	private String type; 

	public Member(String name, int age , String type) {
		super();
		this.name = name;
		this.age=age;
		this.type=type;
	}

	
	@Override
	public String getName() {
		return name;
	}

	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getAge() {
		return age;
	}

	
	@Override
	public String getType() {
		return type;
	}

	
	@Override
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void m1();
	
	

}
