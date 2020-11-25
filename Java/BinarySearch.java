/*https://leetcode.com/problems/binary-search/  */

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] sortedArray,int first,int last,int searchKey) {
		int mid = (first+last)/2;
		while(first<=last) {
			if(sortedArray[mid]<searchKey) {
				first=mid+1;
			}else if(sortedArray[mid] == searchKey) {
				return mid;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int m=0,searchKey=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		m = sc.nextInt();
		int[] sortedArray = new int[m];
		System.out.println("Enter array elements :");
		for(int i=0;i<m;i++) {
			sortedArray[i] = sc.nextInt();
		}
		System.out.println("Enter element to search :");
		searchKey = sc.nextInt();
		int position = binarySearch(sortedArray,0,sortedArray.length-1,searchKey);
		System.out.print("Search key index :");
		System.out.println(position);
	}

}
