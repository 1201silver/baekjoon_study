package algo.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2805 {
	
	static int n;
	static int m;
	
	static int[] tree;
	
	static int max = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		tree = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			
			if(tree[i] > max) max = tree[i];
		}

		System.out.println(search(1, max) - 1);
//		System.out.println(search(1, max));
	}

	static long search(long left, long right) {
		
		if(left > right) {
			return left;
//			return right;
		}
			
		long mid = (left + right) / 2;
		
		long sum = 0;
		for(int i = 0; i < n; i++) {
			if(tree[i] > mid) {
				sum += (tree[i] - mid);
			}
		}
		
		if(sum >= m) {
			return search(mid + 1, right);
			
		} else {
			return search(left, mid - 1);
		}
	}
}
