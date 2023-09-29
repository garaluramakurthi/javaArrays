package Arrays;

import java.util.Scanner;

public class DeleteEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter ele into array "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("enter element to delete");
		int del=sc.nextInt();
		int res[]=new int[a.length-1];
		for(int i=0,j=0;i<res.length;i++) {
			if(a[i]!=del) {
				res[j++]=a[i];
			}
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
			
		

	}

}
