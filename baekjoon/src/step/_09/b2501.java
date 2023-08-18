package step._09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2501 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int i = 1;
		int cnt = 0;
//		while(true) {
////			System.out.println(i);
//			if(n % i == 0) cnt++;
//			
//			i++;
//			
//			if((i > n) || (cnt == k)) break;
//		}
		
		for(i = 1; i <= n; i++) {
			if(n % i == 0) cnt++;
			
			if(cnt == k) break;
		}
		
		if(cnt < k) System.out.println(0);
		else System.out.println(i);
//		System.out.println(i);
	}

}
