package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		while(true) {			
			if(n % 5 == 0) {
				cnt += n / 5;
				break;	
			}
			
			if(n < 3) {
				cnt = -1;
				break;
			}
			
			n -= 3;
			cnt ++;
		}
		
		System.out.println(cnt);

	}

}
