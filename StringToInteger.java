// code to convert the string into number using recursion

import java.util.Scanner;
public class StringToInteger{
	
	public static int convert(String input){
		//base if string len is 1
		if(input.length() == 1){
			int a = input.charAt(0)-'0';
			return a;
		}

		int smallans = convert(input.substring(1));
		int b = input.charAt(0)-'0';
		//return b*Math.pow(10,input.length()-1)+smallans;
		double res = b*(Math.pow(10,input.length()-1))+smallans;
		return (int)res;
	}	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String numerical = s.next();
		System.out.println(convert(numerical));
	}
}