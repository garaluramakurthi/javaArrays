package mock;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int a[] = {5, -3, -4, 6, 8, -3, -1, 7, 2, -5, 3, 1};
		 
		        int currentSum = 0;
		       int Sum=0;

		        for (int i = 0; i < a.length; i++) {
		            currentSum = Math.max(a[i], currentSum + a[i]);
		            Sum = Math.max(Sum, currentSum);
		        }

		        System.out.println("Maximum Sum Subarray: " + Sum);
		    }


	}
	

