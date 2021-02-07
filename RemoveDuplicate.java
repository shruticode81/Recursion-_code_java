// recursive code to remove duplicate character from the string

import java.util.Scanner;
public class RemoveDuplicate{
	
	public static String removeDuplicate(String input){
		//base case
		if(input.length()<=1){
			return input;
		}
		//call recusion func
		String smallans = removeDuplicate(input.substring(1));
		//small calculation
		if(input.charAt(0)==input.charAt(1)){
			return smallans;
		}else{
			return input.charAt(0)+smallans;
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(removeDuplicate(str));
	}
}