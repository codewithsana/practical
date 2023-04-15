package Collection;

import java.util.Iterator;
import java.util.TreeSet;

//navigable set operation
public class TreeSetEg {
public static void main(String[] args) {
//creating & adding elements
	TreeSet<String> set= new TreeSet<String>();//creating
	set.add("A");
	set.add("N");
	set.add("P");
	set.add("D");
	set.add("Q");
	set.add("S");
	set.add("T");
	set.add("J");
	set.add("F");
	set.add("G");
	set.add("Y");
	set.add("C");
	set.add("R");
	System.out.println("original set: "+set);
	//traversing elements through iterator in desending
	Iterator itr= set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		System.out.println("Lowest value: "+set.pollFirst());//lowest word
		System.out.println("update see after pollFirst: "+set);
		System.out.println("Highest value: "+set.pollLast());//highest word
		System.out.println("update see after pollLast: "+set);
System.out.println("Reverse set: "+set.descendingSet());//show in descending 
//sortedset set operation
System.out.println("Head set: "+set.headSet("Q"));//print left side element
System.out.println("sub set: "+set.subSet("J","R"));//print between them
System.out.println("Tail set: "+set.tailSet("S"));//print right side element
}
	
}

