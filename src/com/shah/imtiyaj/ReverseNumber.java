package com.shah.imtiyaj;

import java.util.Scanner;

public class ReverseNumber {
	
	private static Scanner input;
	private static int n;
	private static int reverse=0;
	private static int remainder;


	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		n=input.nextInt();
		
		while (n!= 0) {
			remainder=n%10;
			reverse=reverse*10+remainder;	
			n=n/10;
		}
		
		System.out.print("Reversed Number: "+ reverse);

	}

}
