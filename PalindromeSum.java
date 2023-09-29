package Arrays;

import java.util.Scanner;

public class PalindromeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter ele in array "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int sum=a[0];
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(palin(sum)) {
				System.out.println(sum);
			}
			}
		

	}

	public static boolean palin(int n) {
		// TODO Auto-generated method stub
		int rev=0,temp=n;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return temp==rev;
			
		
		
	}

}
