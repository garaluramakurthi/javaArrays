package Arrays;

import java.util.Scanner;

public class UniqueEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele in array "+(i+1)+":");
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
			if(c==1 && oc[i]!=1) {
				System.out.println(a[i]+"----"+c);
			}
		}
		

	}

}
