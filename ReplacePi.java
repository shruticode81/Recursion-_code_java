//code to replace pi with 3.14 --> input string = "xpix" output --> "x3.14x"

import java.util.Scanner;
public class ReplacePi{
	public static String replace(String input){
		String output;
		//base case if length of input string is <=1 then return the input 
		if(input.length()<=1){
			return input;
		}
		String temp = replace(input.substring(1));
		if(input.charAt(0)=='p' && temp.charAt(0)=='i'){
			output = "3.14"+temp.substring(1);
			return output;
		}
		else{
			output = input.charAt(0)+temp;
			return output;
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();	
		System.out.println(replace(str));
	}
}

