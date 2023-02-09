package objectandclass;
class Staticvariable1 {//class 1
int rollno;//declare global variable
float fee;
String name;
static String college="VMLG";//static keyword
//constructor
Staticvariable1(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display() {//to show the method
System.out.println(rollno+" "+name+" "+fee+" "+college);
}}
public class Staticvariable{//main class
public static void main(String[] args) {
//create object
Staticvariable1 s1= new Staticvariable1(111,"Sana",5000);
Staticvariable1 s2= new Staticvariable1(555,"Priya",6000);
s1.display();//display the data
s2.display();
}
}
