package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<=size-1;i++) {
			System.out.println("enter the ele "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("entered elements are");
		System.out.println("using foreach loop");
		for (int i : a) {
			System.out.println(i);
			
		}
		System.out.println("using for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	
	}
}
