package oops;
interface Parentinterface{
	void show();//by default abstract method
}
public class InterfaceEg implements Parentinterface//class implements interface
{
public void show() {//implement the abstract method
System.out.println("parent interface method");	
}
public static void main(String[] args) {//main method
	InterfaceEg eg= new InterfaceEg();
	eg.show();
}
}
