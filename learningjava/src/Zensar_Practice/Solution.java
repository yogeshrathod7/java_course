package Zensar_Practice;
import java.util.Scanner;

public class Solution{
	public boolean isPowerOfTwo(int x) {
		return x!=0 && ((x & (x-1))==0);
	}
	public void solution(int N) {
		for(int i=1;i<N;i++) {
			if (isPowerOfTwo(i)) {
				System.out.println("POWER");
			}
			else {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s.solution(n);
	}
}