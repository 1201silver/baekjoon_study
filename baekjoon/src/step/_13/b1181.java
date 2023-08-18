package step._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class b1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> word = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			if(!word.contains(s)) {
				word.add(s);
			}
		}

		Collections.sort(word, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
//				int i = 0;
				if(o1.length() == o2.length()) {
//					while(o1.charAt(i) == o2.charAt(i)) {
//						i++;
//					}
//					return o1.charAt(i) - o2.charAt(i);
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});
		
		for(int i = 0; i < word.size(); i++) {
			System.out.println(word.get(i));
		}
		
	}

}
