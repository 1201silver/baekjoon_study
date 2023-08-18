package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int i = 0; i < k; i++) {
			int n =  Integer.parseInt(br.readLine());
			if(n == 0) {
				sum -= stack.pop();
			}
			else {
				sum += n;
				stack.push(n);
			}
		}

		System.out.println(sum);
	}

}
