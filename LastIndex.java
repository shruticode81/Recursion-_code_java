// code to find last index of number in a given array if not present then return -1

import java.util.*;
import java.util.Scanner;
public class LastIndex{
	
	private static int lastIndex(int input[],int x,int si){
		//base case
		if(si == input.length){
			return -1;
		}
		int smallans = lastIndex(input,x,si+1);
		if(smallans!=-1){ //if +ve number then return it
			return smallans;
		}
		if(input[si] == x){
			return si;
		}else{
			return -1;
		}
	}
	public static int lastIndex(int input[],int x){
		return lastIndex(input,x,0);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int x = s.nextInt();
		int res=lastIndex(arr,x);
		System.out.println(res);
	}
}