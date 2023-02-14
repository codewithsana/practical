package objectandclass;
class Employee{//parent class
	int salary=10000;//instance variable
	int bonus=1500;
	//void action() {//user define method
	//int updated_salary=salary+bonus;
	//System.out.println(updated_salary);
	//}
}
class Enginer extends Employee{//child class1
int benifits=1000;//instance variable
}
class Doctor extends Employee{//child class2
	int da=500;//instance variable
}
public class Hierarchical2 {//main class
public static void main(String[] args) {//main method
Enginer e1= new Enginer();//object of child class1
//e1.action();
System.out.println(e1.salary+e1.benifits+"   increment salary for engineer");
Doctor d1= new Doctor();//object of child class2
System.out.println(d1.salary+d1.da+"   increment salary for doctor");
}
}
