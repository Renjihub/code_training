package capabilitydev.training;

/*Take two strings, check if one string is a substring of another*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringCheck {
	
	public static void main(String[] args) throws IOException {
		String sample_1 = null;
		String sample_2 = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sample sentance 1 :");
		sample_1 = reader.readLine();
		System.out.println("Enter sample sentance 2 :");
		sample_2 = reader.readLine();
		System.out.println(sample_1);
		System.out.println(sample_2);
		if(sample_1.contains(sample_2)) {
			System.out.println(sample_2 +" is substring of "+sample_1);
		}else {
			System.out.println(sample_2 +" is not a substring of "+sample_1);
		}
		
		
	}

}
