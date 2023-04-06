package Input_Output;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{//serializable interface
	int id;
	String name;
	int fees;
	public Student(int id,String name,int fees) {//pera constructor
this.id=id;
this.name=name;
this.fees=fees;
	}
}
public class ObjectInputStream_EG {
public static void main(String[] args) {
try {
ObjectInputStream st= new ObjectInputStream(new FileInputStream("E:\\java_io\\input.txt"));
Student s=(Student) st.readObject();//to read the object output stream class
System.out.println("ID is: "+s.id+"\nname is: "+s.name+"\nfees is: "+s.fees);
st.close();
}catch(Exception e) {
	System.out.println(e);
}
}
}
