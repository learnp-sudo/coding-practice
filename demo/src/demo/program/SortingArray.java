package demo.program;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	public static void main(String args[]) {
//		Input: arr[] = {0, 23, 14, 12, 9}
//		Output: {0, 9, 12, 14, 23}
	int arr[]= {0,-23, 14, 12, 9};
//	Arrays.sort(arr);
//	for (int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	for (int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}

		}
	}
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("Enter n to display nth small number ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();

		System.out.println(arr[n-1]);
		System.out.println("Enter K to display Kth largest number ");

		int K=sc.nextInt();

			System.out.println(arr[arr.length-K]);




	}

}
//Arrays.sort(arr);   //default method
