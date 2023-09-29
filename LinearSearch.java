package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele"+(i+1)+":");
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the element to find index");
		int ele=sc.nextInt();
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(ele==a[i]) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("element not present");
		}else {
			System.out.println("ele is present in index"+index);
		}
		

	}

}
