package algorithm.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b11725 {
	
	static int n;
	
//	static boolean[][] tree; // 메모리 초과, 사용 x 메모리 존재
	static ArrayList<ArrayList<Integer>> tree;
	static int[] node;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		tree = new ArrayList<ArrayList<Integer>>();
		node = new int[n + 1];
		visited = new boolean[n + 1];
		
		for(int i = 0; i <= n; i++) { // 0 ~ 7
			tree.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		dfs(1);
		
		for(int i = 2; i <= n; i++) {
			sb.append(node[i] +"\n");
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int p) {
		
		visited[p] = true;
		
		for(int i = 0; i < tree.get(p).size(); i++) {
			int c = tree.get(p).get(i);
			if(!visited[c]) {
				node[c] = p;
				dfs(c);
			}
		}
	}
	
	/*
	static void dfs(int p) {
		
		for(int i = 1; i <= n; i++) {
			if(tree[p][i] == true && tree[i][p] == true && node[i] == 0) {
				node[i] = p;
				dfs(i);
			}
		}
	}*/
	
}
