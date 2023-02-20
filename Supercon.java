package objectandclass;
class Shape2{//parent class
	 Shape2(){//constructor of parent class
		System.out.println("hello");
	}
}
class Size2 extends Shape2{//child class
 Size2() {//constructor of  child class
	 super();//invoke immediate parent class constructor line no.7
	System.out.println("hiii");
}
}
public class Supercon {//main class
public static void main(String[] args) {//main method
	Size2 s1= new Size2();	//creating object of child class
}}
