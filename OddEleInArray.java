package Arrays;
import java.util.*;
public class OddEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------product and sum of odd ele in array-----------------
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("enter ele "+(i+1)+":");
			a[i]=sc.nextInt();
		}
		int pro=1,sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				pro*=a[i];
				sum+=a[i];
				
			}
		}System.out.println("product is "+pro);
		System.out.println("sum is "+sum);

	}

}
