package objectandclass;
//with this keyword
class Thiskeyword1{//class 1
	//instance variable
	int id;
	String ename;
	double salary;
	//parametrized constructor
 Thiskeyword1(int id,String ename,double salary){
this.id=id;
this.ename=ename;
this.salary=salary;
	 }
 void display() {//user define method
	 System.out.println(id+" "+ename+" "+salary);}
 }
public class Thiskeyword {//main class
public static void main(String[] args) {//main method
	 Thiskeyword1 s1=new  Thiskeyword1(01,"priya",5000);
	 Thiskeyword1 s2=new  Thiskeyword1(02,"nisha",6000);
	 s1.display();
	 s2.display();
}
}
