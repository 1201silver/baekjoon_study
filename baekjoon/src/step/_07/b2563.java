package step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[100][100];
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j = x; j < (x + 10); j++) {
				for(int k = y; k < (y + 10); k++) {
					if(paper[j][k] == false) cnt++;
					paper[j][k] = true;
				}
			}
		}
		System.out.println(cnt);
	}

}
