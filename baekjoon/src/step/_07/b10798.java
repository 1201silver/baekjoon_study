package step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] arr = new char[5][15];
		
		int max = 0;
		for(int i = 0; i < 5; i ++) {
			String s = br.readLine();
			
			int n = s.length();
			if(max < n) max = n;
			
			for(int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
//				System.out.println(j +","+ i);
				if(arr[j][i] == '\0') continue;
				System.out.print(arr[j][i]);
			}
		}

	}

}
