package Searching;

import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter total elments you want in a array");
		int n = scr.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter element ");
			a[i] = scr.nextInt();
		}

		System.out.println("array ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n enter element you want to search");
		int ele=scr.nextInt();
		scr.close();
		int i, count=0;
		for(i=0; i<a.length; i++) {
			if(a[i]==ele) {
				System.out.println("element found at "+ (i+1) + " place");
				count++;
				
			} 
		}
		if(count==0)
			System.out.println("element is not present in thee array");
		
	}

}
