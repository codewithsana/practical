package Thread;
//daemon is used to user define thread
public class DemonEg extends Thread{
public void run() {//predefine method
	if(Thread.currentThread().isDaemon()) {//if condition is true
	System.out.println(Thread.currentThread().getName());//current thread	

	System.out.println("I am deamon");}//print if statement
else {
	System.out.println(Thread.currentThread().getName());//current thread
	System.out.println("i am user");//print else statement
}
}
public static void main(String[] args) {//main method
	 DemonEg t= new  DemonEg();//create object
	 DemonEg t1= new  DemonEg();//create object
	 DemonEg t2= new  DemonEg();//create object
	 t.setDaemon(true);//this is predefine to start the daemon method
	 t1.setDaemon(true);
	 //t2.setDaemon(true);----if it is not print by default else part will executed
	 t.start();
	 try {
	 t.join();//to print one after another
	 }catch(InterruptedException e) {
		 System.out.println(e);
	 }
	 t1.start();
	 t2.start();
}}
