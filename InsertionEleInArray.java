package Arrays;

import java.util.Scanner;

public class InsertionEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter ele into array "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("enter ele for insertion");
		int ele=sc.nextInt();
		System.out.println("enter index position");
		int position=sc.nextInt();
		if(position>a.length+1 || position<0) {
			System.out.println("insertion is not possible");
		}else {
			int b[]=new int[a.length+1];
			for(int i=0,j=0;i<b.length;i++) {
				if(i==position-1) {
					b[i]=ele;
				}
				else {
					b[i]=a[j++];
				}
			}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}}

	}

}
