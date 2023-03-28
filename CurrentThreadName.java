package Thread;
//current thread name
public class CurrentThreadName extends Thread{
public void run() {
	System.out.println(Thread.currentThread().getName());
}
public static void main(String[] args) {
	CurrentThreadName t1= new CurrentThreadName();
	CurrentThreadName t2= new CurrentThreadName();
	CurrentThreadName t3= new CurrentThreadName();
	CurrentThreadName t4= new CurrentThreadName();
	CurrentThreadName t5= new CurrentThreadName();
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
}
}
