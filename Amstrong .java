package com.javaproject;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;		
		}if(sum==a) {
			System.out.println("Amstrong");
		}else {
			System.out.println("Not Amstrong");
		}
	}

}
