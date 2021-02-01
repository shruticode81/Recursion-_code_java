//writing recursion code for calculating 1st n natural number 

public class SumOfNatural{

	public static int sum(int n){
		if(n==1){
			return 1;
		}
		int smallans = sum(n-1);
		return n+smallans;
	}
	public static void main(String[] args){
		int n = 3;
		int answer = sum(n);
		System.out.println(answer);
	}
}