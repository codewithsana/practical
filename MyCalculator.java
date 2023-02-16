package objectandclass;
import java.util.Scanner;
class AdvanceArithmetic{//parent class
void divisor_sum(int n){//user define method
Scanner sc= new Scanner(System.in);//user define 
System.out.print("enter the number:");
  n=sc.nextInt();
if(n<1000) {//condition
	int sum=0;
	for(int i=1;i<=n;i++) {//loop to print sum
		if(n%i==0) {//condition
		System.out.println(i);
sum=sum+i;//add value of sum
	}}
	System.out.println("sum is:"+sum);}}}
 public class MyCalculator extends AdvanceArithmetic {//main class

	 public static void main(String[] args) {//main method
	
	MyCalculator c1= new MyCalculator();//object of main class
	c1.divisor_sum(0);//call the mothod

}
}
