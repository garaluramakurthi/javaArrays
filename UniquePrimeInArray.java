package Arrays;

import java.util.Scanner;

public class UniquePrimeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		int oc[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					oc[j]=1;
				}
			}
			
			if(oc[i]!=1 && c == 1 && prime(a[i]) ) {
				System.out.println(a[i]+"---------"+c);
			}
		}

	}
	public static boolean prime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		
		return c==2;
	}

}
