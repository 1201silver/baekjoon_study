package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<Integer> card = new HashSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			card.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			if(card.contains(Integer.parseInt(st.nextToken()))) {
				sb.append(1 +" ");
			} else {
				sb.append(0 +" ");
			}
		}
		System.out.println(sb);
	}

}
