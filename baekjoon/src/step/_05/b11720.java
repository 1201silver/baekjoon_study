package step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			String s = Character.toString(line.charAt(i));
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
