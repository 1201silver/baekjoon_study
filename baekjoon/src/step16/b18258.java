package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());

		Deque<Integer> dq = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			switch(s) {
				case "push":
					dq.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.poll() +"\n");
					break;
				case "size":
					sb.append(dq.size() +"\n");
					break;
				case "empty":
					if(dq.isEmpty()) sb.append(1 +"\n");
					else sb.append(0 +"\n");
					break;
				case "front":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.peek() +"\n");
					break;
				case "back":
					if(dq.isEmpty()) sb.append(-1 +"\n");
					else sb.append(dq.getLast() +"\n");
					break;
			}
		}
		System.out.println(sb);
	}

}
