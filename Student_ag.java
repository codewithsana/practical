package objectandclass;

public class Student_ag {//main class
int id;//instance variable
String name;
Address_ag address;
public Student_ag(int id,Address_ag address,String name) {//paramertized constructor
	this.id=id;//using this keyword
	this.name=name;
	this.address=address;
}
	void display() {//user define method
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {//main method
		Address_ag address1= new Address_ag("Raj nagar","Ghaziabad","U.P.");//address class object
		Address_ag address2= new Address_ag("Kavi nagar","Ghaziabad","U.P.");
		Student_ag s1= new Student_ag(12,address1,"Sana");//main class object
		Student_ag s2=new Student_ag(11,address2,"Sonam");
		s1.display();
		s2.display();
}}
