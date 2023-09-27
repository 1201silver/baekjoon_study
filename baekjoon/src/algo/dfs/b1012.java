package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1012 {
	
	static int m;
	static int n;
	
	static int[][] map;
	static boolean[][] visited;
	
	static int cnt;
	
	// ╩С, го, аб, ©Л
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < t; i++) {
			
			cnt = 0;
			
			st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			map = new int[m][n];
			visited = new boolean[m][n];
			
			for(int j = 0; j < k; j++) {
				
				st = new StringTokenizer(br.readLine());
			
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				map[x][y] = 1;
			}
			
			for(int p = 0; p < m; p++) {
				for(int q = 0; q < n; q++) {
					if(map[p][q] == 1 && !visited[p][q]) {
						dfs(p, q);
						cnt++;
					}
				}
			}
			
			sb.append(cnt +"\n");
		}
		
		System.out.println(sb);
		
	}
	
	static void dfs(int x, int y) {
		
		visited[x][y] = true;
//		cnt ++;
		
		for(int i = 0; i < 4; i++) {
			int a = x + dx[i];
			int b = y + dy[i];
			
			if(a >= 0 && b >= 0 && a < m && b < n) {
				if(map[a][b] == 1 && !visited[a][b]) {
					dfs(a, b);
				}
			}
			
		}
	}

}
