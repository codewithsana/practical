package oops;
interface Employee{//parent interface1
	void salary();//abstract method salary for parent interface1
}
interface Developer{//parent interface1
	void bonus();//abstract method bonus for parent interface1
}
class Trainer implements Employee,Developer{//child class
	public void salary() {//implementation
		System.out.println("salary incremented");
	}
public void bonus() {//implementation
	System.out.println("bonus will be 10% of salary");
}
}
public class Multiple_interface {//main class
public static void main(String[] args) {//main method
	Trainer t1= new Trainer();
	t1.salary();
	t1.bonus();
}
}
