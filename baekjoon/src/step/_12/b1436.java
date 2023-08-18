package step._12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int i = 665;
		while(true) {
			if(String.valueOf(i).contains("666")) {
				cnt ++;
			}
			if(cnt == n) break;
			
			i++;
		}
		System.out.println(i);
	}

}
