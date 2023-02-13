package objectandclass;
class Supclass{//parent class
	int salary=30000;//instance variable of parent class
}
public class Single_inheritance_eg2  extends  Supclass{//child and main class
int bonus=1500;//instance variable of child class
int annualsalary=salary+bonus;
public static void main(String[] args) {//main method
Single_inheritance_eg2 object= new Single_inheritance_eg2();//object of derived class
System.out.println("salary is:"+object.salary);
System.out.println("bonus is:"+object.bonus);
System.out.println("annual salary is"+ object.annualsalary);
}
}
