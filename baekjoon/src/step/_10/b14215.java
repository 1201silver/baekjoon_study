package step._10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b14215 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		Arrays.sort(num);
		
//		System.out.println(num[2]);
		
		int res = num[0] + num[1] + num[2];
		if(num[0] + num[1] <= num[2]) {
			res -= (num[2] - (num[0] + num[1]));
			System.out.println(res - 1);
		} else {
			System.out.println(res);
		}
	}

}
