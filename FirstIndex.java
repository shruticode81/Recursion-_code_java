// code to find first occurence of given number and return the index
import java.util.*;
import java.util.Scanner;
public class FirstIndex{

	private static int firstIndex(int input[],int x,int si){
		//base case
		if(si==input.length-1){
			if(input[si]==x){
				return si;
			}else{
				return -1;
			}
		}
		if(input[si] == x){
			return si;
		}
		int smallans = firstIndex(input,x,si+1);
		return smallans;
	}

	public static int firstIndex(int input[],int x){
		return firstIndex(input,x,0);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int x = s.nextInt();
		int res = firstIndex(arr,x);
		System.out.println(res);
	}

}