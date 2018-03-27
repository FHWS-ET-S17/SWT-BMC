package clubadmin;

import java.util.Comparator;

public class AgeComparator implements Comparator<Member>{

	public int compare(Member m1, Member m2){
		//if (m1.getAge()<m2.getAge()) return -1;
		//if (m1.getAge()>m2.getAge()) return +1;
		//return 0;
		
		//Integer a1= m1.getAge(), a2=m2.getAge();
		//return a1.compareTo(a2);
		
		return m1.getAge().compareTo(m2.getAge());
	}
	
}
