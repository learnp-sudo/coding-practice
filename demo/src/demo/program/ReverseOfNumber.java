package demo.program;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int temp=number;
		int rev=0;

		while(number>0) {
			int num=number%10;
			 rev=num+rev*10;
			 number=number/10;

		}
		if(rev==temp)
			System.out.println("palindrome");
		System.out.println(rev);
	}

}

