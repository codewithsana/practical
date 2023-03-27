package Thread;
//creating thread by extending thread class
public class ThreadEg1 extends Thread {
public void run() {//pre-define method
	System.out.println("i am thread....thread is running");
}
public static void main(String[] args) {
	ThreadEg1 t1= new ThreadEg1();
	t1.start();//move the thread  to the active state
	t1.setName("Sana");
	String s= t1.getName();//to get the name-- local variable
	System.out.println(s);
}
}
