package algo.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2606 {
	
	static int num;
	
	static boolean[][] computer;
	static boolean[] visited;
	
	static int cnt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		num = Integer.parseInt(br.readLine());
		int pair = Integer.parseInt(br.readLine());
		
		computer = new boolean[num + 1][num + 1];
		visited = new boolean[num + 1];
		
		for(int i = 0; i < pair; i++) {
			st = new StringTokenizer(br.readLine());
			
			int c1 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			
			computer[c1][c2] = computer[c2][c1] = true;
		}
		
		dfs(1);
		
		System.out.println(cnt - 1);
	}
	
	static void dfs(int com) {
		
		visited[com] = true;
		
		cnt++;
		
		for(int i = 1; i <= num; i++) {
			if(computer[com][i] == true && !visited[i]) {
				dfs(i);
			}
		}
	}
}
