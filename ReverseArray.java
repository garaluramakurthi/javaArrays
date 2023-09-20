package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele in array "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int rev[]=new int[a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			rev[j]=a[i];
		}
		for(int i=0;i<rev.length;i++) {
			System.out.println(rev[i]);
		}

	}

}
