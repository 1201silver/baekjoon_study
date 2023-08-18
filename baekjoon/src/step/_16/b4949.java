package step._16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4949 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		while(true) {
			String s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			
			for(char c : s.toCharArray()) {
				
				if(c == '(') {
					stack.push(c);
				} 
				else if(c == '[') {
					stack.push(c);
				}
				else if(c == ')') {
					if(stack.empty() || stack.peek() != '(') {
						stack.push(c);
						break;
					}
					else if(stack.peek() == '('){
						stack.pop();
					}
				}
				else if(c == ']') {
					if(stack.empty() || stack.peek() != '[') { // 빈스택에 ) 만나면 뒤에 뭐가 와도 괄호 성립 X
						stack.push(c);
						break;
					}
					else if(stack.peek() == '['){
						stack.pop();
					}
				}	
				
			}
			if(stack.empty()) sb.append("yes\n");
			else sb.append("no\n");
			
			stack.clear();
		}

		System.out.println(sb);
	}

}
