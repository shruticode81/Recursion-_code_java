//code to find , all the indices of a given number using recursion

import java.util.*;
import java.util.Scanner;

public class AllIndex{
	
	private static int[] allIndexes(int Input[],int x,int si){
		//base case if si == input.length
		if(si == Input.length){
			int output[] = new int[0];
			return output;
		}
		int smallans[] = allIndexes(Input,x,si+1);
		if(Input[si]!=x){
			return smallans;
		}
		else{
			int output[] = new int[smallans.length+1];
			output[0] = si;
			for(int i=0;i<smallans.length;i++){
				output[i+1]=smallans[i];
			}
			return output;
		}
	}
	public static int[] allIndexes(int input[],int x){
		return allIndexes(input,x,0);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int x = s.nextInt();
		int res[] = allIndexes(arr,x);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i] + " " );
		}
	}
}