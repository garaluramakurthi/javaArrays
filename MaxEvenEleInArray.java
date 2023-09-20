package Arrays;

import java.util.Scanner;

public class MaxEvenEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("enter elements "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>max && a[i]%2==0) {
				max=a[i];
			}
		}System.out.println(max);

	}

}
