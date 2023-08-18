package step._09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == -1) break;
			
			
			int sum = 0;
			String s = "";
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					s += (i +" + ");
					sum += i;
				}
			}
			
			if(sum != n) {
				System.out.println(n +" is NOT perfect.");
			} else {
				System.out.println(n +" = "+ s.substring(0, s.length() - 3));
			}
		}

	}

}
