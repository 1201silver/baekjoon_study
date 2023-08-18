package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class b2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> dq = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			dq.add(i);
		}
		
		while(dq.size() != 1) {
			dq.poll();
			int card = dq.poll();
			dq.add(card);
		}
		System.out.println(dq.peek());
	}

}
