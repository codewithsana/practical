package objectandclass;

public class OverloadingChangingArg {//main class
	static int sum(int a,int b) {//static method(variable overloded)
		return a+b;
	}
	static double sum (double a,double b) {//static method(variable overloded)
		return a+b;
	}
	public static void main(String[] args) {//main method
		System.out.println("sum of int datatype:"+OverloadingChangingArg.sum(5,6));//arguments
		System.out.println("sum of double datatype:"+OverloadingChangingArg.sum(5.3 , 6.4));//arguments
}
}
