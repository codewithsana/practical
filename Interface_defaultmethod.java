package oops;
interface Parent1{
	void show();
	default void print() {
		System.out.println("default method");
	}
	static void display() {
		System.out.println("static method");
	}
}
class Childeg implements Parent1{
	public void show() {
		System.out.println("parent interface method");
	}
}
public class Interface_defaultmethod {
public static void main(String[] args) {
	Childeg c1= new Childeg();
	c1.print();
	c1.show();
	Parent1.display();	
}
}
