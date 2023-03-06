package oops;
//add number of column known as a jagged array
public class JaggedArray {//class1
public static void main(String[] args) {//main method
	//declare 2d array
	//declare no of rows=3 but column=blank
	int arr[][]= new int [3][];
	//defining column 5+7+9=21
	arr[0]=new int[1];
	arr[1]=new int[2];
	arr[2]=new int[3];
	//initialized the jagged array
	int column=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(" "+arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
