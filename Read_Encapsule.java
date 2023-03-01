package mypackage;
//only getter method for read only
public class Read_Encapsule {//main class
private String name="Pallabi";//if we will not give any name(by default) it print NULL.

public String getName() {//getting the name
	return name;
}
public static void main(String[] args) {//main method
	Read_Encapsule read= new Read_Encapsule();//object of main class
	//read.name("shifa")------we can't change the value of the name
	System.out.println(read.name);
}
}


