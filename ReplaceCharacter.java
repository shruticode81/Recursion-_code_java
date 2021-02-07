// code to replace character recursively ---> input = "abacd" output="xbxcd"

import java.util.Scanner;
public class ReplaceCharacter{
	public static String replace(String input,char c1,char c2){
		//base case if input length is empty
		if(input.length() == 0){
			return input;
		}
		//call recursive method
		String smallans = replace(input.substring(1),c1,c2);
		//small calucation
		char c;
		if(input.charAt(0)==c1){
			c=c2;
		}else{
			c= input.charAt(0);
		}
		return c+smallans;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String character = s.next();
		char c1 = character.charAt(0);
		char c2 = character.charAt(1); 
					// will get string as input
		System.out.println(replace(str,c1,c2));
	}
}