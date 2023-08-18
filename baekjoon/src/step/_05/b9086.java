package step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9086 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++ ) {
			String word = br.readLine();
			System.out.println(word.charAt(0) +""+ word.charAt(word.length() - 1));
		}

	}

}
