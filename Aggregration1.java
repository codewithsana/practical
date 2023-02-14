package objectandclass;
class Aggegrate{//class1
int squre(int r) {//method
return r*r;
}}
public class Aggregration1 {//main class
Aggegrate ag;//object(reference variable)entity
double pi=3.14;
double area(int radius) {//method
ag= new Aggegrate();//convert into object also include line7
int psqure=ag.squre(radius);
return pi*psqure;//pi*r*r
}
public static void main(String[] args) {//main method
Aggregration1 c= new Aggregration1();//object of main class
double result=c.area(5);
System.out.println("area is:"+result);
}
}
