/*https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii*/

public class StringRemoveadjacentDuplicate {
	public String removeAdjacentDuplicate(String sample,int dupCount){
		String temp = sample;
		int count = 0;
		char prevChar = 0;
		for(int i=0;i<sample.length();i++) {
			if(prevChar==0) {
				prevChar = sample.charAt(i);
				count++;
			}else {
				if(prevChar == sample.charAt(i)){
					count++;

				}else {
					prevChar = sample.charAt(i);
					count = 1;
				}
				
			}
			if(count==dupCount) {
				sample=sample.substring(0,i-(dupCount-1))+sample.substring(i+1, sample.length());
				i=-1;
				count = 0;
				prevChar = 0;
			}
		
		}
		if(sample.equalsIgnoreCase(temp)) {
			return "There's nothing to delete.";
		}
		return sample;
	}
	public static void main(String[] args) {
		StringRemoveadjacentDuplicate obj = new StringRemoveadjacentDuplicate();
		String sample = null;
		int dupCount = 0;
		System.out.println("Sample - 1");
		sample = "abcd";
		System.out.println("Sample String : "+sample);
		dupCount = 2;
		sample = obj.removeAdjacentDuplicate(sample, dupCount);
		System.out.println("After removel : "+sample);
		
		System.out.println("Sample - 2");
		sample = "deeedbbcccbdaa";
		System.out.println("Sample String : "+sample);
		dupCount = 3;
		sample = obj.removeAdjacentDuplicate(sample, dupCount);
		System.out.println("After removel : "+sample);
		
		System.out.println("Sample - 3");
		sample = "pbbcggttciiippooaais";
		System.out.println("Sample String : "+sample);
		dupCount = 2;
		sample = obj.removeAdjacentDuplicate(sample, dupCount);
		System.out.println("After removel : "+sample);
	}

}
