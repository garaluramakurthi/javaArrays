package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		//-----------------sorting is needed for bubble sorting-------
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("enter elements"+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("enter element to find index");
		int ele=sc.nextInt();
		int index=-1;
		int first=0,last=a.length-1;
		int mid=((first+last)/2);
		while(first<=last) {
			if(ele==a[mid]) {
				index=mid;
				break;
			}else if(ele>a[mid]){
				first=mid+1;
			}
			else {
				first=mid-1;
			}
			mid=first+last/2;
		}
		if(index==-1) {
			System.out.println("ele not present");
		}else {
			System.out.println("ele is present in index "+index);
		}
		
			
		

	}

}
