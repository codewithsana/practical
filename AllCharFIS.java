package Input_Output;
//we can read all character --using FileInputStream
import java.io.FileInputStream;
//read all character
public class AllCharFIS {
public static void main(String[] args) {
try {
	FileInputStream f= new FileInputStream("E:\\java_io\\inputchar.txt");
int i=0;
while((i=f.read())!=-1){//to read the file
	//it will print one by one all character
System.out.print((char)i);//convert it into character series	
}
f.close();
}catch(Exception e) {
	System.out.println(e);
}
}
}
