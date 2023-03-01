package mypackage;
//we can read only(by getter)
//we can write by using setter
public class Write_Encapsule {
private String name="sana";
public void setName() {
	this.name = name;
}
public static void main(String[] args) {
	Write_Encapsule write = new Write_Encapsule();
	//we cannot use the get method
	//System.out.println(write.getName());
	System.out.println("name: "+write.name);
}
}
