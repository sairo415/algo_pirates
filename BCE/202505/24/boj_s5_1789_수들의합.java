package a20230524;

import java.io.*;

public class boj_s5_1789_수들의합 {

	static long S;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = Long.parseLong(br.readLine());
		long sum = 0;
		long num = 0;
		while(sum <= S) {
			sum += ++num;
		}
		br.close();
		System.out.println(num-1);
	}

}
