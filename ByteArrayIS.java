package Input_Output;

import java.io.ByteArrayInputStream;

//read byte array as input stream
public class ByteArrayIS {
public static void main(String[] args) {
	byte[]arr= {68,37,35,70,39};//byte array --only read the value
	//byte is used to read the number
	ByteArrayInputStream b1= new ByteArrayInputStream (arr);
	int i=0;
	while((i=b1.read())!=-1) {//to print the whole value
		char ch=(char)i;//converting into character
		System.out.println("ASCII character"+i+" "+"value is: "+ch);
	}
}
}
