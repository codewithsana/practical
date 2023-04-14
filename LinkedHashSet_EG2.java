package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_EG2 {
public static void main(String[] args) {
	//allow null method
	Set<String> s= new LinkedHashSet<String>();
	s.add("pen");
	s.add("pencil");
	s.add("mouse");
	s.add("phone");
	s.add(null);
	s.add("AC");
	s.add("bottle");
	s.add("earphone");
	s.add("pen");//not allow duplicate
	Iterator<String> itr= s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
