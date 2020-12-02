
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverseRecursion {
	public static String reverse(String sampleWord) {
		if(sampleWord.isEmpty()) {
			System.out.println(sampleWord
					);
			return sampleWord;
		}
		System.out.println(sampleWord.substring(1));
		return reverse(sampleWord.substring(1)) + sampleWord.charAt(0);
	}
	public static void main(String[] args) throws IOException {
		String sample = null;
		StringBuilder reverseString = new StringBuilder();
		StringBuilder input = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sample sentance :");
		sample = reader.readLine();
		String revString = reverse(sample);
		System.out.println("Reverse String is : "+revString);
		
	}
}
