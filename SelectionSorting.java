package Arrays;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the elements "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
