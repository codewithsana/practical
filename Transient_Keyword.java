package Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//used with data members of class in order to avoid serialization
class Test implements Serializable{
	transient int id;//it showing zero
	 //int id;//this will not serialized
	 String name;
	public Test(int i,String s) {
		this.id=i;
		this.name=s;
	}
}
public class Transient_Keyword {
public static void main(String[] args)throws Exception {
	Test t1= new Test(1,"Sana");
	FileOutputStream f= new FileOutputStream("E:\\java_io\\input.txt");
	ObjectOutputStream o= new ObjectOutputStream(f);
o.writeObject(t1);
o.flush();
o.close();
f.close();
System.out.println("Done");

FileInputStream f1=new FileInputStream("E:\\java_io\\input.txt");
ObjectInputStream oi= new ObjectInputStream(f1);
Test t2=(Test)oi.readObject();
oi.close();
System.out.println(t2.id+" "+t1.name);

}}