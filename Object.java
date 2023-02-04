//3 way to initialize object in java: 1.by reference variable
package objectandclass;
class ObjectEg{
	int id;//instance/global variable
	String name;
}
 public class Object {//main class
public static void main(String[] args) {
	 ObjectEg obj=new ObjectEg();
	obj.id=101;
	obj.name="sana";
	System.out.println(obj.id+" "+obj.name);
	}
}

