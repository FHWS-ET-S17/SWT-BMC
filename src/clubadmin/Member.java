package clubadmin;

import java.util.HashMap;
import java.util.Map;

public abstract class Member implements MemberIF, Comparable<Member>{
	
	private String name;
	private int age;
	private String type; 

	public Member(String name, int age , String type) {
		super();
		this.name = name;
		this.age=age;
		this.type=type;
	}
	
	public Member(Map<String,String> pMap){
		name = pMap.get("name");
		type = pMap.get("typ");
		age = Integer.parseInt(pMap.get("age"));
	}
	
	public Map<String, String> createPMap(){
		Map<String,String> pMap = new HashMap<>();
		pMap.put(new String("name"), name);
		pMap.put("age", new Integer(age).toString());
		pMap.put("typ", type);
		return pMap;
	}
	
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Member m){
		// diese beiden Objekte müssen verglichen werden:  this, m
		String n1 = this.name;
		String n2 = m.getName();
		// if (n1>n2) return -1;
		//if (n1<n2) return +1;
		// return 0;
		return n1.compareTo(n2);
		// oder natürlich kürzer:
		//return this.getName().compareTo(m.getName());
		/*oder, wenn man nach Alter sortieren wollte
		 * if this.getAge() < m.getAge() return -1;
		 * if this.getAge() > m.getAge() return +1
		 * return 0;
		 */
	}

	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Integer getAge() {
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
	

	
	

}
