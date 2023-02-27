package objectandclass;
class Binding {//parent class
void show() {//dynamic binding
	System.out.println("all clear");
}}
public class DynamicBinding extends Binding {//main class
void show() {//dynamic binding
	System.out.println("is it clear");
}
public static void main(String[] args) {//main method
	DynamicBinding db= new DynamicBinding ();
	db.show();
}
}
