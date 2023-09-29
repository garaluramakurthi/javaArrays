package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int rowsize=sc.nextInt();
		System.out.println("enter column size");
		int columnsize=sc.nextInt();
		int a[][]=new int[rowsize][columnsize];
		for (int i = 0; i <rowsize; i++) {
			for (int j = 0; j < columnsize; j++) {
				System.out.println("enter elements ["+i+"]+["+j+"]");
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("entered elements are");
		for (int i = 0; i < rowsize; i++) {
			for(int j=0;j<columnsize;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
			
			
		}

	}

}
