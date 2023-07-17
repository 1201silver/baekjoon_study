package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 10001;
		
		for(int i = m; i <= n; i++) {
			int cnt = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) cnt ++;
			}
			
			if(cnt == 2) {
				sum+= i;
				if(i < min) min = i;
			}
		}
		
		if(sum == 0) System.out.println(-1);
		else System.out.println(sum +"\n"+ min);
	}

}
