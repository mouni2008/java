package com.javaproject;

import java.util.Scanner;

public class Automorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n*n;
		auto(n,m);
		sc.close();		
	}
	public static void auto(int n,int m) {
		int temp=n;
		int p=1;
		while(n>0) {
		    p=p*10;
			n=n/10;			
		}
		if(m % p ==temp) {
			System.out.println("Automorphic");
		}else {
			
			System.out.println("Not automorphic");
		}
	}
}