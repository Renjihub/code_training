
/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array*/

import java.util.Scanner;

public class ArrayMerging {
	static int m=0,n=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size");
		m = sc.nextInt();
		int[] arrayOne = new int[m];
		System.out.println("Enter second array size");
		n = sc.nextInt();
		int[] arrayTwo = new int[n];
		System.out.println("Enter first array elements :");
		for(int i=0;i<m;i++) {
			arrayOne[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements :");
		for(int i=0;i<n;i++) {
			arrayTwo[i] = sc.nextInt();
		}
		mergeArrays(arrayOne, arrayTwo);
	}
	public static void mergeArrays(int[] arrayOne,int[] arrayTwo) {
		int[] mergedArray = new int[m+n];
		System.out.println("First array is :");
		for(int i=0;i<m;i++) {
			System.out.print(arrayOne[i]+" ");
		}
		System.out.println("\nSecond array is");
		for(int i=0;i<n;i++) {
			System.out.print(arrayTwo[i]+" ");
		}
		int i=0,j=0,k=0;
		while(i<m&&j<n) {
			if(arrayOne[i]<arrayTwo[j]) {
				mergedArray[k++] = arrayOne[i++];
			}else {
				mergedArray[k++] = arrayTwo[j++];
			}
		}
		while(i<m) {
			mergedArray[k++] = arrayOne[i++];
		}
		while(j<n) {
			mergedArray[k++] = arrayTwo[j++];
		}
		System.out.println("\nSorted array is :");
		for(i=0;i<m+n;i++) {
			System.out.print(mergedArray[i]+" ");
		}
		
	}
}
