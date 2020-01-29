package org.jan;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		
		for (int i=2;i<=10;i++) {
			if(n%2==0) {
				System.out.println("Not Prime number");
				break;
			}
			else  {
			System.out.println("Prime number");		
			break;
		}
		}		
	}
}


