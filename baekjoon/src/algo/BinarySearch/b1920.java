package algo.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1920 {
	
	static int[] A;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		A = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(search(num, 0, n - 1)) {
				sb.append(1 +"\n");
			} else {
				sb.append(0 +"\n");
			} 
		}
		
		System.out.println(sb);
	}
	
	static boolean search(int target, int left, int right) {
		
		if(left <= right) {
			
			int mid = (left + right) / 2;
			
			if(target == A[mid]) {
				return true;
				
			} else if(target < A[mid]) {
				return search(target, left, mid - 1);
				
			} else {
				return search(target, mid + 1, right);
				
			}
		}
		return false;
	}
}
