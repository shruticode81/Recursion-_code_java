// programme to find the sum of the digits in a number

import java.util.Scanner;
public class SumDigits{
	public static int sumOfDigits(int input){
		//basecase if number is <10 thyen the sum of digit of number will be that number itself
		if(input<10){
			return input;
		}
		int rem = input%10;
		int smallans = sumOfDigits(input/10);
		return rem+smallans;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int res = sumOfDigits(number);
		System.out.println(res);	
	}

}

