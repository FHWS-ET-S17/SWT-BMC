package clubadmin;

import java.util.ArrayList;

public class SClub {
	
	private String name;
	
	private MemberIF member;
	private ArrayList<MemberIF> members = 
			new ArrayList<>();
	
	public void addMember(MemberIF newMember){
		members.add(newMember);
	}
	
	public int memberCount(){
		return members.size();
	}
	
	public MemberIF getMember(int index){
		return members.get(index);
	}
	
	public MemberIF getMember(String name){
		for (int i=0;i<members.size();i++){
			MemberIF aMember = members.get(i);
			if (aMember.getName().equals(name)){
				return aMember;
			}
		}
		
		return null;
	}
	
	public double getAvrgAge(){
		double aAge=0.0;
		for (int i=0;i<members.size();i++){
			MemberIF aMember = members.get(i);
			aAge = aAge + aMember.getAge();
		}
		
		return aAge/members.size();
	}
	
	public void listMembers(){
		System.out.println(getName() + " Mitglieder ---------------------------------------" );
		for (int i=0;i<members.size();i++){
			MemberIF aMember = members.get(i);
			
			System.out.println(aMember.getName() + "; " 
			+  aMember.getAge() + "; " + aMember.getType());
		}
		System.out.println("------------------------------------------------------------\n" );
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
	public SClub(String name,MemberIF member) {
		super();
		this.member = member;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public MemberIF getMember() {
		return member;
	}

	//setter-Injection
	public void setMember( MemberIF member) {
		this.member = member;
	}



	

	
	
	

}
