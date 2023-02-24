package objectandclass;
//final method---can not override final method
class FinalMethod1{//parent class
	
final void display() {//create a final method
	System.out.println("this is a final method");
}}
class Child1 extends FinalMethod1{//child class
//override the final method	
	//try to override final method
	/*final void display() {
		System.out.println("this is a final method");
	}}*/	
}
public class FinalMethod {//main class
public static void main(String[] args) {//main method
Child1 c1= new Child1();//object of child class
c1.display();
}
}
