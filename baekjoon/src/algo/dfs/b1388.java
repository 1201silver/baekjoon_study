package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1388 {
	
	static int n;
	static int m;
	
	static char [][] floor;
	static boolean [][] visited;
	
	static int cnt;
		
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		floor = new char[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			for(int j = 0; j < m; j++) {
				floor[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[i][j]) {
					dfs(i, j);
				}
			}
		}

		System.out.println(cnt);
	}
	
	public static void dfs(int i, int j) {
		visited[i][j] = true;
		
		if(floor[i][j] == '-') {
			if(j + 1 == m) { // 행의 마지막
				cnt++;
			} else if(!visited[i][j + 1] && floor[i][j + 1] == '-') { // 방문 X
				dfs(i, j + 1);
			} else { 
				cnt++;
			}
		}
		else if(floor[i][j] == '|') {
			if(i + 1 == n) { // 열의 마지막
				cnt++;
			} else if(!visited[i + 1][j] && floor[i + 1][j] == '|') {
				dfs(i + 1, j);
			} else {
				cnt++;
			}
		}
	}

}
