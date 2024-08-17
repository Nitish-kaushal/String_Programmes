package Programmes;

import java.util.Scanner;

public class Programm12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int count=String.valueOf(n).length();
		System.out.println("Total Digit in "+n+" is: "+count);
		
	}
}
