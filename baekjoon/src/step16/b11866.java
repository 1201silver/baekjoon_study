package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class b11866 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Deque<Integer> dq = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			dq.add(i);
		}
		
		sb.append("<");
		while(dq.size() != 1) {
			
			for(int i = 0; i < k - 1; i++) {
				int tmp = dq.poll();
				dq.add(tmp);
			}
			
			sb.append(dq.poll() +", ");
		}
		sb.append(dq.poll() +">");
		
		
		System.out.println(sb);
	}

}
