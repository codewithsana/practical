package Input_Output;

import java.io.FileOutputStream;

//write string to byte array--write byte wih file output stream
public class WriteByteFOS {
public static void main(String[] args) {
	try
	{
		FileOutputStream f= new FileOutputStream("E:\\java_io\\stringcode.txt");//destination
	String s="Wlc to anudip foundation";
	byte b[]=s.getBytes();
	//converting string into byte array
			f.write(b);//to show the statement
			f.close();
			System.out.println("Code executed properly");
	}catch(Exception e) {
		System.out.println(e);
	}
}	
}
