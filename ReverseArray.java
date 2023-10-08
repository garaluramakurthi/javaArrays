package mock;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5};	
		System.out.println("Enter a num ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < a.length) {
            int n = a.length;
            int rotatedArray[] = new int[n];

            for (int i = 0; i < n; i++) {
                rotatedArray[i] = a[(i + pos) % n];
            }

            System.out.println("Rotated array:");
            for (int i = 0; i < n; i++) {
                System.out.print(rotatedArray[i] + " ");
            }
        } else {
            System.out.println("Invalid num");
        }




	}

}
