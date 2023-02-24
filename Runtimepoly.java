package objectandclass;
//rumtime polymorphism---dynamic method dispatch
//overload a static method in java---compile time poly
public class Runtimepoly {//main class
public static void main(String[] args) {//main method
	java_Student js;//reference object
	js=new Sana();
	System.out.println("the quality of sana is:"+js.quality());
	js= new Hemant();
	System.out.println("the quality of hemant is:"+js.quality());
}
}
class java_Student{//parent class
	String quality() {//parent class object
		return null;
	}}
	class Ritu extends java_Student{//child class1
		String quality() {
			return "Artist";
		}
	}
	class Hemant extends java_Student{//child class2
		String quality() {
			return "Active";
		}
	}
	class Sana extends java_Student{//child class3
		String quality() {
			return "Good_in-Nature";
		}
	}
	class Prince extends java_Student{//child class4
		String quality() {
			return "unable to run code";
		}
	}
	