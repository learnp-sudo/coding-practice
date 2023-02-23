package demo.program;

import java.util.Scanner;

public class RepeationElementArray {
	public static void main(String args[]) {
//		Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
//				  Output: 4 // x (or 2) occurs 4 times in arr[]
	int	arr[] = {1, 1, 2, 2, 2, 2, 3,};
	System.out.println("Enter element to be counted");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if (x==arr[i]) {
			count++;
		}
	}
	System.out.println(count);
	}

}
