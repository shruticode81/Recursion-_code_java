//code to remove the character "x" from the string

import java.util.Scanner;
public class RemoveX{
	public static String remove(String input){
		String output;
		//basecase
		if(input.length() == 0){
			return input;
		}
		String smallans = remove(input.substring(1));
		if(input.charAt(0)=='x'){
			output = smallans;
			return output;
		}
		else{
			output = input.charAt(0)+smallans;
			return output;
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(remove(str));
	}
}