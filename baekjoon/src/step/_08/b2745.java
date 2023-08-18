package step._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2745 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		long mul = 1;
		long res = 0;
		for(int i = n.length() - 1; i >= 0; i--) {
			
			if(n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') {
				res += (n.charAt(i) - 55) * mul;
			} else {
				res += (n.charAt(i) - 48) * mul;
			}
			
			mul *= b;
		}
		System.out.println(res);
	}

}
