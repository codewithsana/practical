package objectandclass;

public class Parameterized {
int num;
String str;
Parameterized(int n,String s){
	System.out.println("parameterized construct called");
	num=n;
	str=s;
	
}
public static void main(String[] args) {//constructer call
Parameterized sc= new Parameterized (12,"sana");
//print values of object properties
System.out.println("num= "+sc.num);
System.out.println("str= "+sc.str);
}
}
