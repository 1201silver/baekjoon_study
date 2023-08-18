package step._15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1735 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		if(a2 < b2) {
			int tmp1 = a1;
			a1 = b1;
			b1 = tmp1;
			
			int tmp2 = a2;
			a2 = b2;
			b2 = tmp2;
		}
		int c1 = (a1 * b2) + (b1 * a2);
		int c2 = a2 * b2;
		int gcd = getGCD(c1, c2);
		
		System.out.println(c1 / gcd +" "+ c2 / gcd);
	}

	public static int getGCD(int a, int b) {
		if(a % b == 0) return b;
		return getGCD(b, a % b);
	}
}
