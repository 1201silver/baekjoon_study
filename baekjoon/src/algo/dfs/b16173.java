package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16173 {
	
	static int n;
	
	static int[][] jump;
	static boolean[][] visited;
	
	static String res = "Hing";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());

		jump = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				jump[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		
		System.out.println(res);
	}

	static void dfs(int i, int j) {
//		System.out.println(i +" "+ j +" "+ visited[i][j]);
		visited[i][j] = true;
		
		int num = jump[i][j];
		
		if(num == -1) {
			res = "HaruHaru";
		}
		
		if(i + num < n && !visited[i + num][j]) {
			dfs(i + num, j);
		}
		
		if(j + num < n && !visited[i][j + num]) {
			dfs(i, j + num);
		}
		
		/*
		if(i + num >= n) {
			if(j + num >= n) {
				res = "Hing";
			} else if(!visited[i][j + num]) {
				dfs(i, j + num);
			}
		}
		if(j + num >= n) {
			if(i + num >= n) {
				res = "Hing";
			} else if(!visited[i + num][j]) {
				dfs(i + num, j);
			}
		}
		*/
	}
}
