package step._14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num =  Integer.parseInt(st.nextToken());
			
			if(map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
//			System.out.println(map.get(num));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			if(map.get(input) == null) {
				sb.append(0 +" ");
			} else {
				sb.append(map.get(input) +" ");
			}
			
		}
		
		System.out.println(sb);

	}

}
