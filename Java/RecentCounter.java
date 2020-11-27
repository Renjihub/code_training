/*https://leetcode.com/problems/number-of-recent-calls */
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
	public Queue<Integer> time;
	public RecentCounter(){
		time = new LinkedList<Integer>();
	}
	public int ping(int t) {
		time.add(t);
		while(time.peek()<t-3000) {
			time.poll();
		}
		System.out.print(time.size()+" ");
		return time.size();
	}
	public static void main(String[] args) {
		RecentCounter obj = new RecentCounter();
		obj.ping(1);
		obj.ping(100);
		obj.ping(3001);
		obj.ping(3002);
	}

}
