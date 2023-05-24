using System;

public class boj_s5_1789_수들의합 // 백준 클래스 이름 Program으로 작성해야 함
{
	public static void Main(string[] args)
	{
		ulong S = ulong.Parse(Console.ReadLine());
		ulong sum = 0;
		ulong N = 0;
		while(sum <= S)
		{
			sum += ++N;
		}
		Console.WriteLine(N - 1);
	}
}
