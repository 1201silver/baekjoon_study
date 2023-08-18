package step._14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b14425 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> word = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			word.add(br.readLine());
		}
		
		int cnt = 0;
		for(int i = 0; i < m; i++) {
			if(word.contains(br.readLine())) cnt++;
		}
		
		System.out.println(cnt);
	}

}
