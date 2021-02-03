//code to find geometric sum ---> 1+1/2+1/2^2+...

import java.util.Scanner;
public class Geometric{
	public static double geometricSum(int k){
		//base case when k==0
		if(k==0){
			return 1;
		}
		double smallans = geometricSum(k-1);
		double sum = smallans+1/Math.pow(2,k);
		//float f = (float)sum;
		return sum;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double res = geometricSum(k);
		//float f = (float)res;
		//System.out.println(String.format("%.5f",res)); //both prnt statements are correct
		System.out.prntf("%.5f"res);
	}
}