/*https://leetcode.com/problems/remove-outermost-parentheses/*/
public class RemoveOuterParenthesis {

	static String removeOuterParentheis(String sample) {
		StringBuilder sb = new StringBuilder();
		int prev = 0;
		int count = 0;
		for(int i=0;i<sample.length();i++) {
			if(sample.charAt(i)=='(') {
				count++;
			}else {
				count--;
				if(count==0) {
					sb.append(sample.substring(prev+1, i));
					prev = i+1;
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String sample = null;
		System.out.println("Test Case : 1");
		sample = "(()())(())";
		System.out.println("Sample String : "+ sample);
		System.out.println("After removing outer parenthesis : "+removeOuterParentheis(sample));
		
		System.out.println("Test Case : 2");
		sample = "(()())(())(()(()))";
		System.out.println("Sample String : "+ sample);
		System.out.println("After removing outer parenthesis : "+removeOuterParentheis(sample));
		

		System.out.println("Test Case : 3");
		sample = "()()";
		System.out.println("Sample String : "+ sample);
		System.out.println("After removing outer parenthesis : "+removeOuterParentheis(sample));
	}
}
