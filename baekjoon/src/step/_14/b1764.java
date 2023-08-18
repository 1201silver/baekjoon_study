package step._14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b1764 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> name = new HashSet<String>();
		
		for(int i = 0; i < n; i++) {
			name.add(br.readLine());
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			
			if(name.contains(s)) {
				list.add(s);
			}
		}
		sb.append(list.size() +"\n");
		
		Collections.sort(list);
		
		for(String s : list) {
			sb.append(s +"\n");
		}
		
		System.out.println(sb);
	}

}
