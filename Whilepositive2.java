package controlstatement;

import java.util.Scanner;

public class Whilepositive2 {
	public static void main(String[] args) {
		int sum=0;
		int number=0;
		Scanner sc=new Scanner(System.in);//take input from user
		System.out.println("enter the number");
		
		while(true)//condition add only positive number
		{
			number=sc.nextInt();
			if(number<0)break;
			sum+=number;
			
		}
		System.out.println("sum is:"+sum);
		sc.close();
		}
}
