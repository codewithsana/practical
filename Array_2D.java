package oops;
//multidimensional array
public class Array_2D {
public static void main(String[] args) {
	//declaring & initializing 2d array
	int arr[][]= {{2,5,6},{4,6,8}};
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {//for printing row
			System.out.print(arr[i][j]+" ");//for printing column
		}
		System.out.println();
	}
}
}
