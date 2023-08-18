package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b2346 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());

//		Deque<int[]> dq = new LinkedList<int[]>();
		Deque<int[]> dq = new ArrayDeque<int[]>();
		
		st = new StringTokenizer(br.readLine()); 
		
		for(int i = 1; i <= n; i++) {
			dq.add(new int[] {i, Integer.parseInt(st.nextToken())});
		}
		
		// {1, 3}, {2, 2}, {3, 1}, {4, -3}, {5, -1}
		
//		while(!dq.isEmpty()) {
		while(dq.size() > 1) {
			
			int[] arr = dq.poll();
			sb.append(arr[0] +" ");
			int tmp = arr[1];
			
			if(tmp < 0) {
				for(int i = tmp; i < 0; i++) {
					dq.addFirst(dq.pollLast());
				}
			} else {
				for(int i = 0; i < tmp - 1; i++) {
					dq.addLast(dq.pollFirst());
				}
			}
		}
		sb.append(dq.poll()[0] +" ");
		
		System.out.println(sb);
	}

}
