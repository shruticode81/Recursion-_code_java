// writing java code for recursion in factorial of n

public class factorial{

	public static int fact(int n){
		if(n==0){
			return 1;
		}
		int smallans = n*fact(n-1);
		return smallans;
	}
	public static void main(String[] args){
		int n = 5;
		int ans = fact(n);
		System.out.println(ans);
	}
	
}