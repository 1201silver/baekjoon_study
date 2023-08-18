package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if(s.length() % 2 != 0) {
				sb.append("NO\n");
				continue;	
			}
			
			for(char c : s.toCharArray()) {
				if(c == '(') {
					stack.push(c);
				}
				else {
					if(stack.empty()) { // 빈스택에 ) 만나면 뒤에 뭐가 와도 괄호 성립 X
						stack.push(c);
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(stack.empty()) sb.append("YES\n");
			else sb.append("NO\n");
			
			stack.clear();
		}
		
		System.out.println(sb);
	}
	
	/*
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			int left = 0;
			int right = 0;
			
			if(s.length() % 2 != 0) {
				sb.append("NO\n");
			} else {
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == '(') left++;
					else if(s.charAt(j) == ')') right++;
				}
				if(left == right) sb.append("YES\n");
				else sb.append("NO\n");
			}
		}
		System.out.println(sb);
	} */

}
