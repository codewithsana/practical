package oops;
//multiplication of 2 matrix 3*3
public class Matrix_Multi {
public static void main(String[] args) {//main method
	//create matrix
	int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
	int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
	//for storing result creating another matrix
	int c[][]=new int[3][3];//three row three column
	//logic and printing
	for(int i=0;i<3;i++) {//for printing row
		for(int j=0;j<3;j++) {//for printing column
			c[i][j]=0;
			for(int k=0;k<3;k++) {
				c[i][j]=c[i][j]+a[i][k]*b[k][j];//multiplication formula for matrix
			}
			System.out.print(c[i][j]+" ");//for printing multiplication
		}
		System.out.println();
	}
}
}
