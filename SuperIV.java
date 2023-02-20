
package objectandclass;
class Shape{//parent class
	String name="circle";//instance variable
}
class Size extends Shape{//child class
String name="no size";//data member of child class
void print() {//child class method
	System.out.println(name);//it represent child class
	System.out.println(super.name);//it represent imidiate parent class instance variable
}
}
public class SuperIV {
public static void main(String[] args) {
	Size s1= new Size();
	s1.print();
}
}
