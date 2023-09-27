package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b6148 {
	
	static int n;
	static int b;

	static int[] height;
	static boolean[] visit;
	
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken()); // º“
		b = Integer.parseInt(st.nextToken()); // √•¿Â
		
		height = new int[n];
		visit = new boolean[n + 1];
		
		for(int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(br.readLine());
		}
		
		dfs(0);
		
		System.out.print(min);
	}

	static void dfs(int num) {
		
		if(num == n) {
			int sum = 0;
			for(int i = 0; i < n; i++) {
				if(visit[i]) {
					sum += height[i];
				}
			}
			
			if(sum != 0) {
				int h = sum - b;
				
				if(h > 0) {
					if(h < min) min = h;
				}
			}
			
		} else {
			visit[num] = true;
			dfs(num + 1);
			
			visit[num] = false;
			dfs(num + 1);
		}
	}
}
