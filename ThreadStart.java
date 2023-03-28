package Thread;
//we cannot write start method more than one time
//it will show the runtime exception
public class ThreadStart extends Thread{//main class
public void run() {//predefine method
	System.out.println("i am thread...thread is running");
}
public static void main(String[] args) {//main mathod
	ThreadStart t1= new ThreadStart();
	t1.start();//we cannot write start method more than one time
	t1.start();//it will show the runtime exception
}
}
