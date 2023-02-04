package controlstatement;
import java.util.Scanner;//used to taken input from user
public class Whilepositivenum {
public static void main(String[] args) {
	int sum=0;
	int number=0;
	Scanner sc=new Scanner(System.in);//take input from user
	System.out.println("enter the number");
	int number1=sc.nextInt();
	while(number>0)//condition add only positive number
	{
		sum+=number;
		
	}
	System.out.println("sum is:"+sum);
	sc.close();
	}
}

