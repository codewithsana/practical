package oops;
//addition of two matrix-2*2
public class Matrix_addition {//class
public static void main(String[] args) {//main method
	//create matrix
	int a[][]= {{1,2},{3,4}};
	int b[][]= {{1,5},{3,5}};
//for storing result creating another matrix
	int c[][]= new int[2][3];
	//logic and printing
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}}
