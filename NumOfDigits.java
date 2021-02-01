//recursion code for calculating the number of digits in a number

public class NumOfDigits{
	public static int count(int n){
		if(n==0){
			return 0;
		}
		int smallans = count(n/10);
		return 1 + smallans;
	}
	public static void main(String[] args){
		int n = 156;
		int ans = count(n);
		System.out.println(ans);
	}
}