// code to check if a string is palindrome --> input = racecar

import java.util.Scanner;
public class Palindrome{
	private static boolean ispalindrome(String input,int si , int ei){
		//base case if only i letter or 0 letter present in a string
		if(si>=ei){
			return true;
		}
		//basic calcualtion bz we have to 1st compare the 1st and last letter if there not same ,, straight away return false
		//no need to call recursion ,,input string remain same
		if(input.charAt(si)!=input.charAt(ei)){
			return false;
		}
		else{
			boolean smallans = ispalindrome(input,si+1,ei-1);
			return smallans;
		}
	}	

	public static boolean ispalindrome(String input){
		return ispalindrome(input,0,input.length()-1);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(ispalindrome(input));
	}
}

