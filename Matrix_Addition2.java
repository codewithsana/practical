package oops;
//addition of 2 matrix 3*3
public class Matrix_Addition2 {
	public static void main(String[] args) {//main method
		//create matrix
		int a[][]= {{2,2,1},{1,5,0},{0,0,1}};
		int b[][]= {{5,7,1},{0,3,0},{1,0,8}};
		//for storing result creating another matrix
		int c[][]=new int[3][3];//three row three column
		//logic and printing
		for(int i=0;i<3;i++) {//for printing row
			for(int j=0;j<3;j++) {//for printing column
				c[i][j]=a[i][j]+b[i][j];//adding two matrix
				System.out.print(c[i][j]+" ");
}
			System.out.println();
}}}