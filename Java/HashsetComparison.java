/*Compare two sets and retain elements which are same on both sets*/

import java.util.HashSet;
import java.util.Scanner;

public class HashsetComparison {
	public static void main(String[] aargs) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hashSetOne = new HashSet<String>();
		HashSet<String> hashSetTwo = new HashSet<String>();
		System.out.println("Enter the limit for first set :");
		int limitOne = sc.nextInt();
		System.out.println("Enter the elements for first set :");
		for(int i=0;i<limitOne;i++) {
			hashSetOne.add(sc.next());
		}
		System.out.println("Enter the limit for second set :");
		int limitTwo = sc.nextInt();
		System.out.println("Enter the elements for second set :");
		for(int i=0;i<limitTwo;i++) {
			hashSetTwo.add(sc.next());
		}
		System.out.println("First Set :");
		System.out.println(hashSetOne);
		System.out.println("Second Set :");
		System.out.println(hashSetTwo);
		hashSetOne.retainAll(hashSetTwo);
		System.out.println("Set after comparison :");
		System.out.println(hashSetOne);
		
	}

}
