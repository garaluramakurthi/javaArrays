package Arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the ele "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
