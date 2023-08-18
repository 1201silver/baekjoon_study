package step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String word = br.readLine();
			boolean [] alph = new boolean[26];
			boolean group = true;
			
			for(int j = 0; j < word.length(); j++) {
				if(alph[word.charAt(j) - 97]) {
					if(word.charAt(j) != word.charAt(j - 1)) {
						group = false;
					}
				} else {
					alph[word.charAt(j) - 97] = true;
				}
			}
			
			if(group == true) cnt++;
		}
		
		System.out.println(cnt);
	}

}
