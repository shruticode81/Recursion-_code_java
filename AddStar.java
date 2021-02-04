// code to insert a * character in between identical charcter

import java.util.Scanner;
public class AddStar{
	public static String addStar(String input){
		String output;
		//base case
		if(input.length()==1){
			return input;
		}
		String smallans = addStar(input.substring(1));
		if(input.charAt(0)==input.charAt(1)){
			output = input.charAt(0)+"*"+input.charAt(1)+smallans.substring(1);
			//return output;
		}
		else{
			output = input.charAt(0)+smallans;
			//return output;
		}
		return output;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(addStar(str));
	}
}