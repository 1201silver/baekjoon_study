package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11724 {
	
	static int n; // 정점 개수
	static int m; // 간선 개수
	
	static boolean[][] graph;
	static boolean[] vertex;
	
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
	
		graph = new boolean[n + 1][n + 1];
		vertex = new boolean[n + 1];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = graph[v][u] = true;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!vertex[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	static void dfs(int num) {
		
		if(vertex[num]) return;
		
		vertex[num] = true;
		
		for(int i = 1; i <= n; i++) {
			if(graph[num][i] == true) {
				dfs(i);
			}
		}
	}
}
