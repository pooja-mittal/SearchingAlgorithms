package Searching;

import java.util.Scanner;

public class BInarySearch {
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
	int pos=binarySearch(a, ele);
	if(pos!=-1)
	System.out.println("element present at " +(pos+1) + " place");
	else
		System.out.println("element is not present");
}
	public static int binarySearch(int[] a, int ele) {
		int l, h, mid;
		l=0;
		h=a.length-1;
		mid=(l+h)/2;
		while(l<=h) {
			if(a[mid]==ele)
				return mid;
			else if(ele<a[mid]) {
				h=mid-1;
			} else if (ele>a[mid]) {
				l=mid+1;
			}
		}
		return -1;
	}
}
