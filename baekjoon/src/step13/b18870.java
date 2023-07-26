package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] x = new int[n];
		int[] sort_x = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n ; i++) {
			x[i] = sort_x[i] = Integer.parseInt(st.nextToken());
		} 
		
		Arrays.sort(sort_x);  
		
		HashMap<Integer, Integer> min = new HashMap<Integer, Integer>();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(!min.containsKey(sort_x[i])) {
				min.put(sort_x[i], cnt);
				cnt++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int v : x) {
			sb.append(min.get(v) + " ");
		}
		
		System.out.print(sb);
	}

}
