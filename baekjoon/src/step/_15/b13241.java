package step._15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b13241 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		if(a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println((a * b) / getGCD(a, b));
	}

	public static long getGCD(long a, long b) {
		if(a % b == 0) return b;

		return getGCD(b, a % b);
	}
}
