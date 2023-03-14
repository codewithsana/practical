package String;
//represent any object to string
public class ToString_eg {
int rollno;//integer type variable
String name,addr;//string type variable
ToString_eg(int rollno,String name,String addr){
	this.rollno=rollno;
	this.name=name;
	this.addr=addr;
}
public String toString() {//return object to string
	//return super.toString();//object of string
return rollno+" "+name+" "+addr;	
}
public static void main(String[] args) {
	ToString_eg s1= new ToString_eg(1,"Sana","Ghaziabad ");
	//return the hashcode of the object(haxadecimal)
	ToString_eg s2= new ToString_eg(2,"Sadaf","Delhi ");
	System.out.println(s1);//compiler write s1.tostring()
	System.out.println(s2);
}
}
