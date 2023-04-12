package Collection;

import java.util.Vector;

public class Vector_EG {
public static void main(String[] args) {
	//creating vector
	Vector<String> vc= new Vector<String>();
	//adding elements to vector
	vc.add("Dog");
	vc.add("Cat");
	vc.add(0,"Tiger");
	//vc.add("Lion");
	//checking size & capacity
	System.out.println("Size:"+vc.size());
	System.out.println("Capacity:"+vc.capacity());//old cap *3/2+1
	//add more elements
	vc.addElement("Cow");
	vc.addElement("goat");
	System.out.println("after adding elemets:");
	System.out.println("Size:"+vc.size());
	System.out.println("Capacity:"+vc.capacity());
	//checking cat is present in the vector or not
	System.out.println(vc);
	if(vc.contains("Cat")) {
	System.out.println("Elements present:");
	}else {
		System.out.println("Elemets not present");
	}
	//getting 1st elements
	System.out.println("1st elements:"+vc.firstElement());
	//getting last elements
	System.out.println("last elements: "+vc.lastElement());
	//checking index of specified elements
	System.out.println("index:"+vc.indexOf("Cat"));
}
}






















