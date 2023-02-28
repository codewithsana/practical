package oops;
//inheritance with interface
interface Parent{//parent interface
	void show();
}
interface Child extends Parent{//child interface(using extends)
	void display();
}
class Child1 implements Child{//another child interface(class to interface using implement)
	public void show() {//implement the show method
		System.out.println("parent interface method");
	}
	public void display() {//implement the display method
		System.out.println("child interface method");
	}
}
public class Inherited_interface {//main class
public static void main(String[] args) {//main method
	Child1 c1= new Child1();
	c1.show();
	c1.display();
}
}
