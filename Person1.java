package mypackage;
//if we create fully encapsulated class in java than  we have to make all...
//the date member of the class private
//we can use getter setter method to set and get the data
public class Person1 {
	private String name;//instance variable
	private int age;
	public String getName() {//get the name
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {//get the age
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
