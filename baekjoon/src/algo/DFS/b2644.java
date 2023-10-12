package algo.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2644 {
	
	static ArrayList<ArrayList<Integer>> tree;
	static boolean[] visited;
	
	static int res = -1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		tree = new ArrayList<ArrayList<Integer>>();
		visited = new boolean[n + 1];
		
		for(int i = 0; i <= n; i++) { 
			tree.add(new ArrayList<Integer>());
		}
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			tree.get(x).add(y);
			tree.get(y).add(x);
		}
		
		dfs(a, b, 0);
		
		System.out.println(res);
	}
	
	static void dfs(int start, int end, int cnt) {
		
		visited[start] = true;
		
		if(start == end) {
			res = cnt;
			return;
		}
		
		for(int i = 0; i < tree.get(start).size(); i++) {
			int w = tree.get(start).get(i);
			if(!visited[w]) {
				dfs(w, end, cnt + 1);
			}
		}
	}
}
