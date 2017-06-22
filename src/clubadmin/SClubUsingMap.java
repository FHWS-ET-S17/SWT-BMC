package clubadmin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SClubUsingMap {
	private Map<String,Member>memberMap=new HashMap<>(); 
	
	
	public boolean addMember(Member m){
		if (memberMap.containsKey(m.getName())) return false;
		memberMap.put(m.getName(), m);
		return true;
	}
	
	public Member getMember (String name){
		return memberMap.get(name);
	}
	
	public double getAvrgAge1(){
		Iterator<String> mIterator = memberMap.keySet().iterator();
		double age=0.0;
		int mCount =0;
		while(mIterator.hasNext()){
			String mName = mIterator.next();
			Member m = memberMap.get(mName);
			age = age + m.getAge();
			mCount++;
		}
		//return age/mCount;
		return age/memberMap.size();
		
	}
	
	public double getAvrgAge2(){
		Iterator<Member> mIterator = memberMap.values().iterator();
		double age=0.0;
		while(mIterator.hasNext()){
			Member m = mIterator.next();
			age = age + m.getAge();
		}
		//return age/mCount;
		return age/memberMap.size();
		
		
	}	

}
