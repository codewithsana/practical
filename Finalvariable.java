package objectandclass;
//final variable
public class Finalvariable {//main class
final int value=50;//final variable
void display() {
	System.out.println(value);
}
public static void main(String[] args) {//main method
	Finalvariable fv= new Finalvariable();
	fv.display();
}
}
