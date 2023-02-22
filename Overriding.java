package objectandclass;
class TestOverriding {//parent class
void run() {//overload method of parent class
	System.out.println("running mode on");
}
}
public class Overriding extends TestOverriding {//child and main class
	//overriding is used to show current update 
	void run() {//overload method of child class
		System.out.println("running mode off");
	}
	public static void main(String[] args) {//main method
		Overriding a= new Overriding();
		a.run();
	}
}
