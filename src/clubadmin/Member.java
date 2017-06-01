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

	/* (non-Javadoc)
	 * @see clubadmin.MemberIF#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see clubadmin.MemberIF#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see clubadmin.MemberIF#getAge()
	 */
	@Override
	public int getAge() {
		return age;
	}

	/* (non-Javadoc)
	 * @see clubadmin.MemberIF#getType()
	 */
	@Override
	public String getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see clubadmin.MemberIF#setType(java.lang.String)
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}
	
	

}
