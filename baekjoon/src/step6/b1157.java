package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class b1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine().toUpperCase();
		HashMap<Character, Integer> alph = new HashMap<Character, Integer>();
		
		for(int i = 0; i < word.length(); i++) {
			if(alph.get(word.charAt(i)) == null) {
				alph.put(word.charAt(i), 1);
			} else {
				alph.put(word.charAt(i), alph.get(word.charAt(i)) + 1);
			}
			
		}
		
		int max = -1;
		char flag = '?';
		
		for(Object key: alph.keySet()) {
			if(max < alph.get(key)) {
				max = alph.get(key);
				flag = (char) key;
			} else if(max == alph.get(key)) {
				flag = '?';
			}
		}
		
		System.out.println(flag);
	}	

}
