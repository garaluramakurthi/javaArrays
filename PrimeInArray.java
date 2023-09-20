package Arrays;

import java.util.Scanner;

public class PrimeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter elements "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(a[i]);
			}
		}
		

	}

}
