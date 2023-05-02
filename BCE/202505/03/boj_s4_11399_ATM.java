package a20230503;

import java.io.*;
import java.util.*;

public class boj_s4_11399_ATM {
	
	static int N, ans;
	static int[] times, sum;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		times = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		Arrays.sort(times);
		sum = new int[N];
		ans = sum[0] = times[0];
		for (int i = 1; i < N; i++) {
			sum[i] = sum[i-1] + times[i];
			ans += sum[i];
		}
		System.out.println(ans);
	}

}

// 정렬 후 누적합?