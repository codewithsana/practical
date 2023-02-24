package objectandclass;
//runtime polymorphism can't achieved by data member
public class Runtimepoly_eg {//main class
public static void main(String[] args) {//main method
	//papa_mama object;
	Children object= new Children();
	System.out.println(object.priority);
	}
}
class papa_mama{//parent class
	String priority="high";
}
class Children extends papa_mama{//child class
	String priority="Super high";
}
