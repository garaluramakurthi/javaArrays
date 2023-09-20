package Arrays;

import java.util.Scanner;

public class StoringPrimeEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(prime(a[i])) {
				c++;
			}
		}
		int prime[]=new int[c];
		for(int i=0,j=0;i<a.length;i++) {
			if(prime(a[i])) {
				prime[j++]=a[i];
			}
		}
		for(int i=0;i<prime.length;i++) {
			System.out.println(prime[i]);
		}
		}
			
		public static boolean prime(int n) {
			int c=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;
				}}
			
			return c==2;
		}

	

}
