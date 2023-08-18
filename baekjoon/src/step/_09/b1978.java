package step._09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int prime = 0;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			for(int j = 1; j <= num; j++) {
				if(num % j == 0) cnt ++;
			}
			
			if(cnt == 2) prime++;
		}
		
		System.out.println(prime);
	}

}
