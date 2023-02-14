package objectandclass;
class Vehical1{//parent class
	void running() {//user define method
	System.out.println("running mode on");
}}
class Car1 extends Vehical1{//child class 1
	void run() {//user define method
		System.out.println("car run mode on");
	}
}
class Bike1 extends Vehical1{//child class 2
	void speed() {//user define method
		System.out.println("speed is very high");
	}
}
public class Hierarchical_inheritance {//main class
public static void main(String[] args) {//main method
	Bike1 b1= new Bike1();//child class1 object
	b1.running();
	b1.speed();
	Car1 c1= new Car1();//child class2 object
	//c1.running();
	c1.run();
}
}
