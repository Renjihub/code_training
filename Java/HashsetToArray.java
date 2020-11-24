import java.util.HashSet;
import java.util.Scanner;

/*Convert a hash set to an array*/
public class HashsetToArray {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for(int i=0;i<limit;i++) {
			hashSet.add(sc.next());
		}
		System.out.println("HashSet :");
		System.out.println(hashSet);
		String[] strArray = new String[hashSet.size()];
		hashSet.toArray(strArray);
		System.out.println("Array elements :");
		for(String str:strArray) {
			System.out.print(str+",");
		}
	}

}
