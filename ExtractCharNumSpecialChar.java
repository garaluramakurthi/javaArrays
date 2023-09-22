package Arrays;

import java.util.Scanner;

public class ExtractCharNumSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------extract number of uppercase alphabets,lowercase,specialcharacter,numbers------------
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		char ch[]=new char[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the ele "+(i+1)+":");
			ch[i]=sc.next().charAt(0);
		}
		int upper=0,lower=0,number=0,character=0;
		for (char c : ch) {
			if(c>='A' && c<='Z') {
				upper++;
			}else if(c>='a' && c<='z') {
				lower++;
			}else if(c>'1' && c<='9') {
				number++;
			}else {
				character++;
			}
		}
		System.out.println("number of uppercase alphaberts "+upper);
		System.out.println("number of lowercase alphaberts "+lower);
		System.out.println("number of digits "+number);
		System.out.println("number of special characyters "+character);
		

	}

}
