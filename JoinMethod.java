package Thread;

public class JoinMethod extends Thread{//main class with extend thread
public void run() {//pre define method
	for(int i=1;i<=3;i++) {
		try {
			Thread.sleep(100);//break for a time inside single thread
		}catch(Exception e) {
			System.out.println(e);
			}
		System.out.println(i);
	}
}
public static void main(String[] args) {//main method
	JoinMethod t1 = new JoinMethod();//main class method
	JoinMethod t2 = new JoinMethod();
	JoinMethod t3 = new JoinMethod();
	t1.start();//thread1
	try {//it will print 1--2--3
		//t1.join();
	}catch(Exception e) {
		System.out.println(e);
		}
	t2.start();//thread2//it will print 1--1,2--2,3--3
	t3.start();//thread3
}
}
