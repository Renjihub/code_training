/*Write a program to get a reverse order view of the keys contained in a given map*/
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapKeyReverse {
	public static void main(String[] args) {
		TreeMap<String,String> tMap = new TreeMap<String,String>();
		Scanner sc = new Scanner(System.in);
		String key;
		String value;
		System.out.print("Enter a limit for tree entry : ");
		int limit = sc.nextInt();
		
		System.out.println("Enter tree elements :");
		for(int i=1;i<=limit;i++) {
			System.out.println("Key : "+"K"+Integer.toString(i));
			key = "K"+Integer.toString(i);
			System.out.print("Value :");
			value = sc.next();
			tMap.put(key,value);
			limit--;
		}
		System.out.println("Reverse order view of keys :");
		System.out.println(tMap.descendingKeySet());
	}
}
