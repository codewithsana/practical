package oops;

abstract class Example {
	Example (){
		System.out.println("no argument");
	}
	abstract void show();//non implemented method(no body)
	void run() {//non abstract method
		System.out.println("non abstract method");
	}
}
class Example1 extends Example {
	void show() {//override method
		System.out.println("method body");//parent abstract method body
	}
}
public class Abstracteg{
	public static void main(String[] args) {
		Example eg= new Example1();
		eg.show();
		eg.run();
	}
}