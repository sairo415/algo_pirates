package a20230531;

import java.io.*;
import java.util.*;

public class boj_s5_10814_나이순정렬 {

	static int N;
	static Member[] members;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		members = new Member[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Member member = new Member();
			member.setAge(Integer.parseInt(st.nextToken()));
			member.setName(st.nextToken());
			members[i] = member;
		}
		br.close();
		
		Arrays.sort(members, (o1, o2) -> o1.age - o2.age);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			Member member = members[i];
			sb.append(member.getAge()).append(" ").append(member.getName()).append("\n");
		}
		System.out.print(sb.toString());
	}
	
	public static class Member {
		int age;
		String name;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
