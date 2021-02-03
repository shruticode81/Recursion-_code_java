// number of 0's in a number
import java.util.Scanner;
public class NumOfZero{
	public static int numZero(int input){
		if(input<10){
			if(input == 0){
				return 1;
			}else{
				return 0;
			}
		}
		if(input%10 == 0){
			return numZero(input/10)+1;
		}
		else{
			return numZero(input/10);
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int res = numZero(n);
		System.out.println(res);
	}

}