package oops;
//example of single dimentional array
public class Array_eg {
public static void main(String[] args) {
	//declaring and initializaing the array
	//name and phone is instance(object)
	String [] names= {"Mamta","Ram","Karan","Ajay","Priya","Tina"};
	for(int i=0;i<names.length;i++) {//length is predefine property of array
		System.out.println(names[i]);
	}
	System.out.println();
	int [] phone= {123,4556,3554,677,556,787,899,676,67,6676};
	for(int j=0;j<phone.length;j++) {
	System.out.println(phone[j]);	
	}
}
}
