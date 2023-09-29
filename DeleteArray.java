package Arrays;

import java.util.Scanner;

public class DeleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the ele in array "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("enter ele to delete");
		int del=sc.nextInt();
		int index=search(a,del);
		if(a.length==0) {
			System.out.println("array is empty");
		}else if(index==-1) {
			System.out.println("deletion not possible");
		}else {
			int res[]=new int [a.length-1];
			for(int i=0,j=0;i<res.length;i++) {
				if(i!=index) {
					res[j++]=a[i];
				}
			}
			for(int i:res) {
				System.out.println(i);
			}
				
				
		}

	}

	public static int search(int[] a, int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		// TODO Auto-generated method stub
		return -1;
	}

}
