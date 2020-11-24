import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*For given string, count how many palindromic substrings are in the string*/

public class PalindromeCount {
	private static StringBuilder reversebuilder = null;
	private static int palindromeCount = 0;
	public static void main(String[] args) throws IOException {
		String sample = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sample string :");
		sample = reader.readLine();
		System.out.println(sample);
		for(int i=0;i<sample.length();i++) {
			for(int j=i;j<=sample.length();j++) {
				String subString =sample.substring(i,j);
				reversebuilder = new StringBuilder();
				String reverse = reversebuilder.append(subString).reverse().toString();
				if(subString.length()>1 && subString.equalsIgnoreCase(reverse)) {
					palindromeCount++;
				}
				
			}
		}
		System.out.println("Number of palindrome substrins in given string is :"+palindromeCount);
	}

}
