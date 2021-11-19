package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,7,6,8};
		int n=arr.length;
		Arrays.sort(arr);
		System.out.println("sorted array is");
		for(int i=0;i<arr.length;i++) {
			System.out.println("array["+i+"]"+arr[i]);
		}
		int sum=((n+1)*(n+2))/2;
		for(int j=0;j<arr.length;j++) {
			sum=sum-arr[j];
		}
		System.out.println("missing number is:"+sum);
		

	}

}
