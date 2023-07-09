package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2908 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = reverseNum((st.nextToken()).toCharArray());
		int num2 = reverseNum((st.nextToken()).toCharArray());
		
		System.out.println(Math.max(num1, num2));
	}
	
	public static int reverseNum(char[] num) {
		
		char tmp = num[0];
		num[0] = num[2];
		num[2] = tmp;
		
		return Integer.parseInt(String.valueOf(num));
	}

}
