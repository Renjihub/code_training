/*Write a program to sort keys in Tree Map by using comparator*/
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapKeySort {
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
		System.out.println("Tree Map --> "+tMap);
		
		}
}
class keySort implements Comparator<String>{
	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1.compareTo(str2);
	}
	
}
