package Arrays;

import java.util.Scanner;

public class RemovingTargetEle {

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
		System.out.println("enter target ele");
		int target=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=target) {
				c++;
			}
		}
		int b[]=new int [c];
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=target) {
				b[temp++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
