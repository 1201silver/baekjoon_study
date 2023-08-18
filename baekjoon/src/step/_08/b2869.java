package step._08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2869 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
//		System.out.println((a + b + v) / a);
		
		int day = (v - a) / (a - b) + 1;
		
		if((v - a) % (a - b) != 0) {
			day += 1;
		}
		
		System.out.println(day);
 	}

}
