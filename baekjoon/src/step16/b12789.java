package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class b12789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		Queue <Integer> q = new LinkedList<Integer>();
		Stack <Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < n; i++) {
			q.add(Integer.parseInt(st.nextToken()));
		}
		
		int order = 1;
		
		while(!q.isEmpty()) { // for(int i = 0; i < n; i++) << 이렇게는 틀림, 왜 ....
			if(q.peek() == order) {
//				System.out.println(std);
				q.poll();
				order++;
			} else if(!stack.empty() && order == stack.peek()) {
//				System.out.println(stack.peek());
				stack.pop();
				order++;
			} else {
//				System.out.println(std);
				stack.push(q.poll());
			}
		}
		
		while(!stack.empty()) {
			
			if(order == stack.peek()) {
//				System.out.println(stack.peek());
				stack.pop();
				order++;
			} else {
				System.out.println("Sad");
				break;
			}
		}
		
		if(stack.empty()) System.out.println("Nice");
	}

}
