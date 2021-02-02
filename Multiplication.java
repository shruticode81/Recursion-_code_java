//multiplication using recursion 

import java.util.*;
import java.util.Scanner;

public class Multiplication{

	public static int multiply(int m , int n){
		//basecase if n decrese to 0
		if(n==0){
			return 0;
		}
		int smallans = multiply(m,n-1);
		return m+smallans;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int res = multiply(m,n);
		System.out.println(res);
	}
}