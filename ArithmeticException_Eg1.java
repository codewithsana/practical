package Exception;

public class ArithmeticException_Eg1 {
	 public void display() {  // user define method
		 //before try-catch block
		 String a="I am error";
		 System.out.println(a);
		 try {
			 int i=50/0; //Arithmetic exception
			 System.out.println(i);
			 //after exception can't execute the other lines
			 String s="riya";
			 System.out.println(s.length());
		 }
		 catch(Exception e) {
			 System.out.println(e);  //print the error
		 System.out.println("Exception aaya hai!"); // to print the message
		 }
		 //after try-catch block
		String b="I cannot be handle";
		System.out.println(a+" "+b);  //I am error+ I cannot be handle
	 }
	   public static void main(String[] args) {  //main method
		ArithmeticException_Eg1 ep=new ArithmeticException_Eg1();  //object 
		ep.display();  //calling the method through object
	}
}
