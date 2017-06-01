package clubadmin;

import java.util.ArrayList;

public class SClub {
	
	private String name;
	
	private Member member;
	private ArrayList<Member> members = 
			new ArrayList<>();
	
	public void addMember(Member newMember){
		members.add(newMember);
	}
	
	public int memberCount(){
		return members.size();
	}
	
	public Member getMember(int index){
		return members.get(index);
	}
	
	public Member getMember(String name){
		for (int i=0;i<members.size();i++){
			Member aMember = members.get(i);
			if (aMember.getName().equals(name)){
				return aMember;
			}
		}
		
		return null;
	}
	
	public double getAvrgAge(){
		double aAge=0.0;
		for (int i=0;i<members.size();i++){
			Member aMember = members.get(i);
			aAge = aAge + aMember.getAge();
		}
		
		return aAge/members.size();
	}
	
	public void listMembers(){
		for (int i=0;i<members.size();i++){
			Member aMember = members.get(i);
			System.out.println(aMember.getName() + "; " 
			+  aMember.getAge());
		}
	}
	
	public boolean removeMember(String name){
		return members.remove(this.getMember(name));
		
//		Member mToRemove = getMember(name);
//		if (mToRemove!=null){
//			members.remove(mToRemove);
//			return true;
//		}
//		return false;
	}
	
	public SClub(String name) {
		super();
		this.name = name;
	}
	
	// Constructor-Injection
	public SClub(String name,Member member) {
		super();
		this.member = member;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public Member getMember() {
		return member;
	}

	//setter-Injection
	public void setMember( Member member) {
		this.member = member;
	}



	

	
	
	

}
