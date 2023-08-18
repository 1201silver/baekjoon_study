package step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String[] word = br.readLine().split(" ");
		
		int cnt = 0;
		for(int i = 0; i < word.length; i++) {
			if(word[i].length() == 0) cnt++;
		}
		System.out.println(word.length - cnt);
	}

}
