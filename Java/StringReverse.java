import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	
	public static void main(String[] args) throws IOException {
		String sample = null;
		StringBuilder reverseString = new StringBuilder();
		StringBuilder input = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sample sentance :");
		sample = reader.readLine();
		String[] words = sample.split(" ");
		for (String word : words) {
			input = new StringBuilder();
			input.append(word);
			reverseString.append(input.reverse()+" ");
		}
		System.out.println("Reverse String is : "+reverseString);
		
	}

}
