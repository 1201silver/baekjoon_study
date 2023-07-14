package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2738 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m];
		
		for(int i = 0; i < 2; i ++) {
			
			for(int j = 0; j < n; j++) {
				String line = br.readLine();
				st = new StringTokenizer(line);
				
				for(int k = 0; k < m; k++) {
					a[j][k] += Integer.parseInt(st.nextToken());
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}

	}

}
