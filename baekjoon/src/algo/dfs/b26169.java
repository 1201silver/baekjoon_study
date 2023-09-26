package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b26169 {

	static final int SIZE = 5;
	
	static int[][] board;
	
	// ╩С, го, аб, ©Л
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	static int result = 0;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		board = new int[SIZE][SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < SIZE; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		dfs(r, c, 0, 0);
		
		System.out.println(result);
	}

	static void dfs(int r, int c, int cnt, int apple) {
		
//		System.out.println(r +", "+ c +", "+ cnt);
		
		if(board[r][c] == 1) {
			apple++;
		}
		
		board[r][c] = -1;
		
		if(cnt == 3) {
			if(apple >= 2) {
				result = 1;
			}
			
			return;	
		} 
		
		for(int i = 0; i < 4; i++) {
			int x = r + dx[i];
			int y = c + dy[i];
			
//			System.out.println(x +", "+ y);
			
			if(x >= 0 && y >= 0 && x < SIZE && y < SIZE && board[x][y] != -1) {
				dfs(x, y, cnt + 1, apple);
			}
			
			board[r][c] = 0;
		}
		
	}
}
