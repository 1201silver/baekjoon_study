package algo.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b10816 {
	
	static int[] card;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());

		card = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			sb.append(searchHigh(num, 0, n) - searchLow(num, 0, n) +" ");
		}
		
		System.out.println(sb);
	}
	
	static int searchLow(int target, int left, int right) {
		
		while(left < right) {
			
			int mid = (left + right) / 2;
			
			if(target > card[mid]) {
				left = mid + 1;
				
			} else {
				right = mid;
			}
		}
		
		return left;
	}
	
	static int searchHigh(int target, int left, int right) {
		
		while(left < right) {
			
			int mid = (left + right) / 2;
			
			if(target >= card[mid]) {
				left = mid + 1;
				
			} else {
				right = mid;
			}
		}
		
		return right;
	}

}
