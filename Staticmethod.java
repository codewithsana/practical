package objectandclass;

import java.util.Scanner;

class Staticmethod1 {//class 1
int rollno;//instance variable
String name;
float fee;
static String college="VMLG";//static variable
static void change() {//static method to change college name
college="ITS";
}
//parameterized constructor
Staticmethod1(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display() {//user define method to display 
System.out.println(rollno+" "+name+" "+fee+" "+college);	
}}
public class Staticmethod {//main class
public static void main(String args[]) {//main method
Staticmethod1.change();//calling static method with class name
//create object
Staticmethod1 s1= new Staticmethod1(101,"pihu",5000);
Staticmethod1 s2= new Staticmethod1(102,"ayeza",3000);
s1.display();
s2.display();
}}
