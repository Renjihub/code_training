/*https://leetcode.com/problems/task-scheduler/ */
import java.util.Arrays;
import java.util.Collections;

public class TaskSchedulLeastInterval {
		public static int taskwithleaseTime(char[] tasks,int interval) {
			if(interval==0) {
				return tasks.length;
			}
			if(tasks.length ==0 ) {
				return 0;
			}
			Integer[] freq = new Integer[26];
			Arrays.fill(freq,0);
			for(char ch:tasks)
				freq[ch-'A']++;
			//Arrays.sort(freq, Collections.reverseOrder());
	        int total = 0;
	        int pos = 0;
	        while(pos<tasks.length){
	           //Arrays.sort(freq, Collections.reverseOrder());
	            int temp_tot = 0;
	            for(int i = 0; i<26; i++){
	                if(temp_tot>interval) break;
	                if(freq[i]>=1){
	                    temp_tot++;
	                    freq[i]--;
	                    pos++;
	                    if(pos==tasks.length) 
	                    	return (total + temp_tot);
	                }
	            }
	            total += interval+1;
	        }
			return total;
		}
		public static void main(String[] args) {
			String task = null;
			char[] tasks = new char[20];
			int n = 0;
			System.out.println("\nTest Case : 1");
			task = "AAABBB";
			tasks = task.toCharArray();
			n=2;
			Arrays.sort(tasks);
			for(char ch:tasks) {
			System.out.print(ch + " ");
			}
			System.out.println("\nInterval = "+n);
			System.out.println("Output :"+taskwithleaseTime(tasks, n));
			
			System.out.println("\nTest Case : 2");
			task = "AAABBB";
			tasks = task.toCharArray();
			n=0;
			Arrays.sort(tasks);
			for(char ch:tasks) {
			System.out.print(ch + " ");
			}
			System.out.println("\nInterval = "+n);
			System.out.println("Output :"+taskwithleaseTime(tasks, n));
			
			System.out.println("\nTest Case : 3");
			task = "AAAAAABCDEFG";
			tasks = task.toCharArray();
			n=2;
			Arrays.sort(tasks);
			for(char ch:tasks) {
			System.out.print(ch + " ");
			}
			System.out.println("\nInterval = "+n);
			System.out.println("Output :"+taskwithleaseTime(tasks, n));	

		}
}
