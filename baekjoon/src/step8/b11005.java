package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11005 {

	public static void main(String[] args) throws IOException {
//		System.out.println((char)65);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long num = Long.parseLong(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String res = "";
		long tmp;
		 do {
			tmp = num % b;
			
			if(tmp >= 10) {
				res += (char) (tmp + 55);
			}
			else res += tmp;
			
			num = num / b;
//			System.out.println(num);
			
		} while(num > 0);
		
		for(int i = (res.length() - 1); i >= 0; i--) {
			System.out.print(res.charAt(i));
		}
	}

}
