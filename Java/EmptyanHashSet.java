import java.util.HashSet;
import java.util.Scanner;

/*Empty an hash set.*/
public class EmptyanHashSet {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for(int i=0;i<limit;i++) {
			hashSet.add(sc.next());
		}
		System.out.println(hashSet);
		hashSet.clear();
		System.out.println("HashSet after clearing :");
		System.out.println(hashSet);
	}

}
