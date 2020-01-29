package org.jan;

public class Pattern1 {
	public static void main(String[] args) {
		switch(1){
		case 1:
			System.out.println("\t*");
		case 2:
			System.out.print("     ");
			for (int i=1;i<=2;i++) {
				System.out.print(" * ");
			} 
		case 3:	
			System.out.println();
			System.out.print("    ");
			for(int i=1;i<=3;i++) {
				System.out.print(" * ");
			}	
		case 4:	
			System.out.println();
			System.out.print("   ");
			for(int i=1;i<=4;i++) {
				System.out.print(" * ");
			}
		case 5:	
			System.out.println();
			System.out.print(" ");
			for(int i=1;i<=5;i++) {
				System.out.print(" * ");
			}
			break;
		}}}

