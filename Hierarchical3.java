package objectandclass;
class Arithmetic{//parent class
	int a=10;//instance variable
	int b=5;	
}
class Add extends Arithmetic{//child class1
	int c=a+b;
}
class Mul extends Arithmetic{//child class2
	int d=a*b;
	}
public class Hierarchical3 {//main class
public static void main(String[] args) {//main method
	Add a1= new Add();//object class1
	System.out.println(a1.a+" and "+a1.b+" is:"+a1.c);
	Mul m1= new Mul();//object class 2
	System.out.println(m1.a+" and "+m1.b+" is:"+m1.d);
}
}
