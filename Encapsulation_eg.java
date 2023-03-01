package mypackage;

public class Encapsulation_eg {//main class
public static void main(String[] args) {//main method
	Person1 p1= new Person1();//creating of the object of encapsulated person class
	p1.setName("Sana");//setting value in the name
	p1.setAge(22);//setting value in the age
	System.out.println("Name: "+p1.getName());//getting value in the name
	System.out.println("Age: "+p1.getAge());//getting value in the age
}
}
