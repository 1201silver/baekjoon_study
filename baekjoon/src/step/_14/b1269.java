package step._14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class b1269 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashSet<Integer> a = new HashSet<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		int cnt_b = 0;
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			b.add(num);
			if(!a.contains(num)) cnt_b++;
		}
		
		int cnt_a = 0;
		for(int num : a) {
			if(!b.contains(num)) cnt_a++;
		}
		
		System.out.println(cnt_a + cnt_b);

	}

}
