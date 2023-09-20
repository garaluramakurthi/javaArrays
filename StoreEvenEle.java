package Arrays;

import java.util.Scanner;

public class StoreEvenEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele in "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				c++;
			}
		}
		int even[]=new int[c];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[j++]=a[i];
			}
		}
		for(int i=0;i<even.length;i++) {
			System.out.println(even[i]);
		}
			

	}

}
