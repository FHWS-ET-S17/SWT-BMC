package clubadmin;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class SClubUsingList {
	
	private List<Member> members = new ArrayList<>();
	
	
	public void addMember(Member m){
		members.add(m);
	}
	
	public boolean removeMember(String name){
		Iterator<Member> mIterator = members.iterator();
		while (mIterator.hasNext()){
			Member nextMember = mIterator.next();
			if (nextMember.getName().equals(name)){
				//members.remove(nextMember); Fehler, Löschen nur mithilfe
				// des Iterators zulässig
				mIterator.remove();
				return true;
			}
		}
		return false;
		
		
	}
	

}
