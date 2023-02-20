package objectandclass;
class Batch{//parent class
int id;//instance variable
String name;
double fees;
Batch(int id,String name,double fees){//perametrized constructor
	this.id=id;
	this.name=name;
	this.fees=fees;
}
}
class Batch_member extends Batch{//child class
	long phone_no;//child class property
	Batch_member(int id,String name,double fees,long phone_no){//child class comstructor
	super( id, name, fees);//reusing parent constructor	
	this.phone_no=phone_no;
	}
	void show() {//user define method
		System.out.println(id+" "+name+" "+fees+" "+phone_no);
	}}
public class Delhi_Batch {//main class
public static void main(String[] args) {//main method
	Batch_member b1= new Batch_member(2,"sana",1500,678854);
	b1.show();
}
}