package objectandclass;
import java.util.Scanner;
public class Paraconstructor {
int a;
int b;
Paraconstructor(){//default constructor
Scanner sc= new Scanner(System.in);
System.out.print("enter the first number");
 a=sc.nextInt();
 System.out.print("enter the second number");
 b=sc.nextInt();
}
Paraconstructor(int x,int y){//perameter constructor
	a=x;
	b=y;
}
void show() {//show constructor
int c=a+b;
System.out.print(" "+"sum is:"+c);
}
public static void main(String[] args) {
	//create object...
	Paraconstructor d1=new Paraconstructor();
	Paraconstructor d2= new Paraconstructor();
	System.out.print("without perameter");
	d1.show();
	System.out.println();
	System.out.print("with perameter");
	d2.show();
}
}
