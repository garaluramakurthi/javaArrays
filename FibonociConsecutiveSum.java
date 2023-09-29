package Arrays;

import java.util.Scanner;

public class FibonociConsecutiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter elements "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int sum=a[0];
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(fib(sum)) {
				System.out.println(sum);
			}
		}

	}

	public static boolean fib(int n) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=n1+n2;
		if(n==0) {
			return true;
		}
		while(n3<=n) {
			if(n3==n) {
				return true;
			}
			n1=n2;n2=n3;n3=n1+n2;
		}
		return false;
	}

}
