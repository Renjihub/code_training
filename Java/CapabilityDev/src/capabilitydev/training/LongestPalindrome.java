package capabilitydev.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*For given String consists of lowercase or uppercase letters, 
 return the length of the longest palindrome that can be built with those letters.*/

public class LongestPalindrome {
	private static StringBuilder sb = new StringBuilder();
	private static StringBuilder reversebuilder = null;
	private static List<String> combinations = new ArrayList<>();
	private static int palindromeLength=0;
	public static void main(String[] args) throws IOException {
		String sample = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sample sentance :");
		sample = reader.readLine();
		combinations = createcombination(sample, 0);
		for(String word : combinations) {
			String reverse = null;
			reversebuilder = new StringBuilder();
			reverse = reversebuilder.append(word).reverse().toString();
			if(word.equalsIgnoreCase(reverse)) {
				if(palindromeLength<word.length()) {
					palindromeLength = word.length();
				}
			}
		}
		System.out.println("Longest palindrome combination count is :"+palindromeLength);
		
	}

	public static List<String> createcombination(String sample,int start){	
        for( int i = start; i < sample.length(); ++i ){
            sb.append( sample.charAt(i) );
            combinations.add(sb.toString());
            if ( i < sample.length() )
            createcombination( sample,i + 1);
            sb.setLength( sb.length() - 1 );
            
        }
        return combinations;
    }
}
