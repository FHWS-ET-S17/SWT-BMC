package clubadmin;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SClubUsingSet {
	
	private SortedSet<Member> members1 = new TreeSet<>();
	private SortedSet<Member> members2 = new TreeSet<>(new AgeComparator());
	
	
	public void addMember (Member m){
		members1.add(m);
		members2.add(m);
	}
	
	public void removeMember(String name){
		//members1.remove(name); falsch
		//Member m = new PassiveMember(name, 0);//Vergleichsobjekt 
		//Member m = new PassiveMember("", 17);
		//members1.remove(m);
		
		//Löaschen mit Suche und Iterator

		Iterator<Member> mIt = members1.iterator();
		while (mIt.hasNext()){
			Member m = mIt.next();
			if (m.getName().equals(name));
			mIt.remove();
		}
		
	}

}
