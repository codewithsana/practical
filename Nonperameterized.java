package objectandclass;

 class A {
int a;
String st;
A(){
	a=10;
 st="hello world";
}
void show() {
	System.out.println(a+" "+st);
}}
public class Nonperameterized{
public static void main(String[] args) {
	A obj=new A();//this object is created to call the show method	
	obj.show();
}}

