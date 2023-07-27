package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b1620 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> pokemon_num = new HashMap<String, String>();
		HashMap<String, String> pokemon_str = new HashMap<String, String>();
		
		for(int i = 0; i < n; i++) {
			String name = br.readLine();
			pokemon_num.put(String.valueOf(i+1), name);
			pokemon_str.put(name, String.valueOf(i+1));
		}
		
		for(int i = 0; i < m; i++) {
			String ans = br.readLine();
			
			if(pokemon_num.containsKey(ans)) {
				sb.append(pokemon_num.get(ans) +"\n");
				
			} else if(pokemon_str.containsKey(ans)) {
				sb.append(pokemon_str.get(ans) +"\n");
			}
		}
		System.out.println(sb);
	}

}
