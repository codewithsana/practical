package objectandclass;
class Shape1{//parent class
	void print() {//parent class method
		System.out.println("print circle");
	}
}
class Size1 extends Shape1{//child class
	void print() {//same method of parent class(child class method)
		System.out.println("print triangle");
	}
	void display() {//new mrthod of child class
		System.out.println("print nothing");
	}
	void show() {//final method
		super.print();//reference immidiate parent method
		display();
		print();
	}
}
public class Supermethod {//main class
public static void main(String[] args) {//main method
	Size1 s1= new Size1();
	s1.show();
}
}
