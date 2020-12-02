package capabilitydev.training;

import java.util.Scanner;
import java.util.TreeMap;
/*Write a program to get the greatest key less than or equal to the given key*/
public class TreeMapGreatestKey {
	public static void main(String[] args) {
		TreeMap<String,String> tMap = new TreeMap<String,String>();
		Scanner sc = new Scanner(System.in);
		String key;
		String value;
		System.out.print("Enter a limit for tree entry : ");
		int limit = sc.nextInt();
		
		System.out.println("Enter tree elements :");
		while(limit>0) {
			System.out.print("Key :");
			key = sc.next();
			System.out.print("Value :");
			value = sc.next();
			tMap.put(key,value);
			limit--;
		}
		System.out.println(tMap);
		System.out.print("Enter the key to search :");
		String searchKey = sc.next();
		System.out.println("Greatest key less than or equal to the given key :"+tMap.floorKey(searchKey));
	}
}
