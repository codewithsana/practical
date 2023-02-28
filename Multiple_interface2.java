package oops;
interface Employee1{//parent interface1
	void salary();
}
interface Developer1{//parent interface1
	void salary();
}
class Trainer1 implements Employee1,Developer1{
	public void salary() {
		System.out.println("salary incremented");
	}
}
public class Multiple_interface2 {
public static void main(String[] args) {
	Trainer1 t1= new Trainer1();
	t1.salary();
}
}
