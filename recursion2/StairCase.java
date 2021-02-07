// code to find all possible ways a child can climb N step staircase if he can get 1,2 and3 steps at once
//we can do the same problem in dp to using memorization concepts
import java.util.Scanner;
public class StairCase{
	public static int stair(int input){
		//base case if n<0 ,,-ve numbers will return 0
		if(input<0){
			return 0;
		}
		if(input==0){
			return 1;
		}
		int x = stair(input-1); //if child have taken 1 step so n-1 step is left call recursion on them
		int y = stair(input-2);
		int z = stair(input-3);
		return x+y+z;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(stair(n));
	}
}