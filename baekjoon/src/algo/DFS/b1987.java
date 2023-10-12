package algo.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1987 {
	
	static int r;
	static int c;
	
	static int[][] map;
	static boolean[] alph;
	
	// ╩С, го, аб, ©Л
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	static int max = 0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		alph = new boolean[26];
		
		for(int i = 0; i < r; i++) {
			String s = br.readLine();
			for(int j = 0; j < c; j++) {
				map[i][j] = s.charAt(j) - 'A';
			}
		}
		
		dfs(0, 0, 0);
		
		System.out.println(max);
	}
	
	static void dfs(int x, int y, int cnt) {
		
		if(alph[map[x][y]]) {
			if(max < cnt) max = cnt;

			return;
		}
		
		alph[map[x][y]] = true;
		
		for(int i = 0; i < 4; i++) {
			int a = x + dx[i];
			int b = y + dy[i];
			
			if(a >= 0 && b >= 0 && a < r && b < c) {
				dfs(a, b, cnt + 1);
//				if(!alph[map[a][b]]) {
//					dfs(a, b, cnt + 1);
//				}
			}
		}
		alph[map[x][y]] = false;
	}

}
