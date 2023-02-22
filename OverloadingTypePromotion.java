package objectandclass;

public class OverloadingTypePromotion {//main class
	void add (int a,int b) {//method overloded
		System.out.println(a+b);
	}
	void add(int a,int b, int c) {//method overloded
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {//main method
		OverloadingTypePromotion obj=new OverloadingTypePromotion();//main class object
		obj.add(2, 3);
		obj.add(10,20,30);
	}
}
