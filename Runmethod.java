package Thread;

public class Runmethod extends Thread {
public void run() {
	System.out.println("Thread activated");
}
public static void main(String[] args) {
	Runmethod r1= new Runmethod();
	//because we are using thread in place of implemets runnable
	r1.run();
	r1.setName("Sana");
	String s=r1.getName();
	System.out.println(s);
}
}
