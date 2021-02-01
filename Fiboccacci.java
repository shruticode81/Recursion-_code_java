//recursion code to display the fiboccacci of nth number - in this we will use two smaller problem to solve big problem 

public class Fiboccacci{
	public static int fib(int n){
		if(n==0 || n==1){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args){
		int n =3;
		int ans = fib(n);
		System.out.println(ans);
	}

}
