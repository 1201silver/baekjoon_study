package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class b17103 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] prime = new boolean[1000001];
		prime = getPrimeNum(prime);
		
		int t = Integer.parseInt(br.readLine());

		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int cnt = 0;
			for(int j = 2; j <= n / 2; j++) {
				if(!prime[j] && !prime[n - j]) cnt++;
			}
			sb.append(cnt +"\n");
		}
		System.out.println(sb);
	}

	public static boolean[] getPrimeNum(boolean[] prime) {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i * i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
		return prime;
	}
}
