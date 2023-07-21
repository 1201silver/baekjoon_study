package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int res = 0;
		for(int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			sum += i;
			
			if(sum == n) {
				res = i;
				break;
			}	
		}
		System.out.println(res);
	}

}
