package objectandclass;

public class OverloadingChangingArgs {//main class
	static int sum(int a,int b) {//static method and variable overloded
		return a+b;
	}
	static int sum (int a,int b,int c) {//static method and variable overloded
		return a+b+c;
	}
	public static void main(String[] args) {//main method
		System.out.println(OverloadingChangingArgs.sum(5,6));
		System.out.println(OverloadingChangingArgs.sum(5,6,7));
	}
}
