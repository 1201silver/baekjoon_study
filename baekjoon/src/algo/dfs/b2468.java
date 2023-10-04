package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2468 {
	
	static int n;

	static int[][] map;
	static boolean[][] visited;

	// ╩С, го, аб, ©Л
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
		
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());

		map = new int[n][n];
		
		int height = 0;
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(height < map[i][j]) height = map[i][j];
			}
		}
		
		int cnt;
		int max = 0;
		
		for(int i = 0; i <= height; i++) {
			
			visited = new boolean[n][n];
			
			cnt = 0;
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					if(!visited[j][k] && map[j][k] > i) {
						dfs(j, k, i);
						cnt++;
					}
				}
			}
//			System.out.println(cnt);
			if(max < cnt) max = cnt;
		}
		
		System.out.println(max);
	}
	
	static void dfs(int x, int y, int h) {
		
		visited[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			
			int a = x + dx[i];
			int b = y + dy[i];
			
			if(a >= 0 && b >= 0 && a < n && b < n) {
				if(!visited[a][b] && map[a][b] > h) {
					dfs(a, b, h);
				}
			}
		}
	}

}
