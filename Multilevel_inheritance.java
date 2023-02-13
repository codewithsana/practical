package objectandclass;
class Parent1{//parent class1
	void show() {//user define method
	System.out.println("show the details");	
	}
}
class Parent2 extends Parent1{//parent  and child class
	void display() {//user define method
	System.out.println("display the result");	
	}
}
class Child extends Parent2{//child class
	void print() {//user define method
		System.out.println("print the result");
	}
}
 public class Multilevel_inheritance {//main class
public static void main(String[] args) {//main method
	Child c1= new Child();//object of child class
	c1.display();
	c1.show();
	c1.print();
}
}
