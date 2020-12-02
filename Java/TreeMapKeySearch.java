/*Write a program to search a key in a Tree Map*/
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapKeySearch {

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
		System.out.println(tMap.values());
		System.out.println("Enter the key to search :");
		String searchKey = sc.next();
		if(tMap.containsKey(searchKey)) {
			System.out.printf("Key %s is found, Value stored in the key is %s.",searchKey,tMap.get(searchKey));
		}
	}
}
