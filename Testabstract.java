package oops;
abstract class Test1{//abstract class
	abstract void display();//abstract method 
	void show() {//non abstract method
	System.out.println("non abstract menthod invoke");	
	}
}
class Test2 extends Test1{//child class1
	void display() {//abstract method or parent class
		System.out.println("demo 1 method invoke");
	}
}
class Test3 extends Test1{//child class2
void display() {//abstract method or parent class
	System.out.println("demo2 method invoke");
}
}
public class Testabstract {//main class
public static void main(String[] args) {//main method
	Test2 t1= new Test2();//child1 object
	Test3 t2= new Test3();//child1 object
	t1.display();
	t2.display();
	t1.show();
}
}
