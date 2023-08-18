package step._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] alph = new int[26];
		String word = br.readLine();
		
		for(int i = 0; i < 26; i++) {
			alph[i] = -1;
		}
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			if(alph[c - 'a'] == -1) alph[c - 'a'] = i;
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(alph[i] +" ");
		}
	}

}
