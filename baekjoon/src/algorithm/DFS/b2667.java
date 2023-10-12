package algorithm.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class b2667 {
	
	static int n;
	
	static char[][] map;
	static boolean[][] visited;
	
	static int cnt;
	static int home;
	
	// ╩С, го, аб, ©Л
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		map = new char[n][n];
		visited = new boolean[n][n];

		for(int i = 0; i < n ; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				home = 0;
				
				if(map[i][j] == '1' && !visited[i][j]) {
					cnt++;
					dfs(i, j);
					
					list.add(home);
				}
			}	
		}
		
		sb.append(cnt +"\n");
		
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i) +"\n");
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int x, int y) {
		
		visited[x][y] = true;
		home++;
		
		for(int i = 0; i < 4; i++) {
			int a = x + dx[i];
			int b = y + dy[i];
			
			if(a >= 0 && b >= 0 && a < n && b < n) {
				if(map[a][b] == '1' && !visited[a][b]) {
					dfs(a, b);
				}
			}
		}
	}

}
