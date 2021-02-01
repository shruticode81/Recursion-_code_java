//recursion code to calculate the power(x^n)

import java.util.*;
import java.util.Scanner;
public class CalculatePower{
	public static int power(int x,int n){ //x and n are pass by value
		if(n==1){
			return x;
		}
		int smallans = power(x,n-1);
		return x*smallans;
	
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int ans = power(x,n);
		System.out.println(ans);
	}

}