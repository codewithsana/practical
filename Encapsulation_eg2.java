package mypackage;

public class Encapsulation_eg2 {//main class
public static void main(String[] args) {//main method
	Bank b1= new Bank();//object of bank class
	b1.setAccount_num(57448984);//setting value in the account number
	b1.setName("sana");//setting value in the name
	b1.setE_mail("sana12@gmail.com");//setting value in the e mail
	b1.setAmount(50000);//setting value in the  amount
	System.out.println("account number is:"+b1.getAccount_num());//getting the values
	System.out.println("name is:"+b1.getName());
	System.out.println("e mail id is:"+b1.getE_mail());
	System.out.println("amount is:"+b1.getAmount());
}
}
