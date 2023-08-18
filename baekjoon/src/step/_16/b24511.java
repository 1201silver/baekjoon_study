package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class b24511 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1;
		StringTokenizer st2;
		
		int n = Integer.parseInt(br.readLine());
		
		st1 = new StringTokenizer(br.readLine());	
		st2 = new StringTokenizer(br.readLine());	
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i = 0; i < n; i++) {
			int ds = Integer.parseInt(st1.nextToken());
			int seq = Integer.parseInt(st2.nextToken());
			
			if(ds == 0) { // queue
				dq.add(seq);
			} 
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st1 = new StringTokenizer(br.readLine());	
		for(int i = 0; i < m; i++) {
			dq.addFirst(Integer.parseInt(st1.nextToken()));
			sb.append(dq.pollLast() +" ");
		}
		
		System.out.println(sb);
	}

}
