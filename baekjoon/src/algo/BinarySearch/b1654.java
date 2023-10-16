package algo.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1654 {
	
	static int n;
	static int m;
	
	static int[] line;
	
	static int max = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		line = new int[n];
		for(int i = 0; i < n; i++) {
			line[i] = Integer.parseInt(br.readLine());
			
			if(max < line[i]) max = line[i];
		}
		
		System.out.println(search(1, max));
	}
	
	static long search(long left, long right) {
	
		if(left > right) {
			return right;
		}
		
		long mid = (left + right) / 2;
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
				cnt += (line[i] / mid);
		}
		
		if(cnt < m) {
			return search(left, mid - 1);
			
		} else {
			return search(mid + 1, right);
		}
	}
}
