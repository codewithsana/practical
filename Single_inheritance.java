package objectandclass;

 class Siparent {//parent class
void show() {//user define mrthod
	System.out.println("show the details");
}}
class Sichild extends Siparent{//child class
	void display() {//user define method
System.out.println("display the result");
}}
public class Single_inheritance	{//main class
public static void main(String[] args) {//main method
Sichild child= new Sichild();//object of child class	
child.display();
child.show();
}}
