package objectandclass;
class parent1{//parent class
int salary=30000;//instance variable of parent class
}
class parent2 extends parent1{//parent and child class
int bonus=1500;//instance variable of class derived 
}
public class MultiLevel2  extends parent2{//child and main class
int annualsalary= salary+bonus;//instance variable of child class
public static void main(String[] args) {//main method
MultiLevel2 ob1= new MultiLevel2();//object of child class
System.out.println("salary is:"+ob1.salary);
System.out.println("bonus is:"+ob1.bonus);
System.out.println("annual salary:"+ob1.annualsalary);
}
}
