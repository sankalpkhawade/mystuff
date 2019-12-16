package com.cognizant.HandsOn2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int n, i, j, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of elements : ");
		n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements : ");
		for (i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted list of elements : ");
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
		scanner.close();
	}

}
