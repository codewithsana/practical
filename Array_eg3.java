package oops;

public class Array_eg3 {
	public static void main(String[] args) {
		int a[]=new int[5];//declare and instantiation
		//initialization
		a[4]=2;
		a[0]=4;
		a[3]=7;
		a[1]=89;
		a[2]=6;
		//traversing an array	(print one after another)	
		//for(int i=0;i<a.length;i++) {//length is one of the property an array
		for(int i:a) {	//by for each loop
		System.out.println(i);
		}
	}
}
