package step._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b10814 {
	
	public static class Member {
		
		int age;
		String name;
		
		public Member(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public String toString() {
			return age + " " + name;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Member> member = new ArrayList<Member>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			Member m = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
			member.add(m);
		}
		
		Collections.sort(member, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.age - o2.age;
			}
		});
		
		for(Member m: member) {
			System.out.println(m);
		}
	}

}
