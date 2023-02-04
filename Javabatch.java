package objectandclass;
//how to define a class & field(data member/variable)
public class Javabatch {
	//defining field(instance/global variable)
		int id;
		String Bname;
		public static void main(String[] args) {
			//create object
			Javabatch jb=new Javabatch();//declare 1st object
			Javabatch jb1=new Javabatch();//declare 2nd object
			//print value 
			jb.id=1;
			jb.Bname="C4119";
			System.out.println("id is:"+jb.id+" "+"batch name is:"+jb.Bname);
		    //print value
			jb1.id=2;
			jb1.Bname="C4116";
			System.out.println("id is:"+jb1.id+" "+"batch name is:"+jb1.Bname);
			}
}
