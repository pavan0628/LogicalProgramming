package com.rcb.numberproblems;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swaping \na="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swaping \na="+a+" b="+b);
		
		
		
		
	}

}
