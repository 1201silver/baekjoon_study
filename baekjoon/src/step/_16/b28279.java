package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b28279 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());

		Deque<Integer> dq = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "1":
					dq.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case "2":
					dq.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "3":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.pollFirst() +"\n");
					break;
				case "4":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.pollLast() +"\n");
					break;
				case "5":
					sb.append(dq.size() +"\n");
					break;
				case "6":
					if(dq.isEmpty()) sb.append(1 +"\n");
					else sb.append(0 +"\n");
					break;
				case "7":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.peekFirst() +"\n");
					break;
				case "8":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.peekLast() +"\n");
					break;
					
			}
		}
		System.out.println(sb);
	}

}
