package step._12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = n - 1; i >= 0; i--) {
			for(int j = i - 1; j >= 0; j--) {
				for(int k = j - 1; k >= 0; k--) {
					sum = card[i] + card[j] + card[k];
					// && (card[i] != card[j] && card[j] != card[k] && card[i] != card[k])
					if(sum <= m) {
						if(max < sum) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.println(max);
	}

}
