package algo.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10026 {
	
	static int n;

	static boolean[][] visited;
	
	static int cnt;
	
	// 상, 하, 좌, 우
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		char[][] map = new char[n][n]; // 적록색약 x
		char[][] cmap = new char[n][n]; // 적록색약 o
		
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				char ch = s.charAt(j);
				map[i][j] = ch;
				
				if(ch == 'G') {
					cmap[i][j] = 'R';
				} else {
					cmap[i][j] = ch;
				}
			}
		}
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					dfs(map, i, j);
					cnt++;
				}
			}
		}
		sb.append(cnt +" ");
		
		cnt = 0;
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					dfs(cmap, i, j);
					cnt++;
				}
			}
		}
		sb.append(cnt);
		

		System.out.println(sb);
	}
	
	static void dfs(char[][] m, int x, int y) { 
		
		visited[x][y] = true;
		
		char c = m[x][y];
		
		for(int i = 0; i < 4; i++) {
			int a = x + dx[i];
			int b = y + dy[i];
			
			if(a >= 0 && b >= 0 && a < n && b < n) {
				if(m[a][b] == c && !visited[a][b]) {
					dfs(m, a, b);
				}
			}
		}
	}
}
