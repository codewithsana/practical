package oops;
interface Shape{//this is interface
	void shape1();//by default abstract method
}
class Circle implements Shape{//child class1
	public void shape1() {//implement the abstract method
		System.out.println("draw a circle");
	}
}
class Triangle implements Shape{//child class2
	public void shape1() {//implement the abstract method
		System.out.println("draw a triangle");
	}
}
public class InterfaceEg2 {//main class
public static void main(String[] args) {//main method
	Shape s1= new Triangle();
	s1.shape1();
}
}
