// recursion in array ,, check whether array is sorted or not 

public class CheckSorted{

	public static boolean check(int input[]){
		if(input.length<=1){ // base case
			return true;
		}
		//solving smaller problem for n-1 length array ,, check whether it is sorted
		int smallInput[] = new int[input.length-1];
		for(int i=1;i<input.length;i++){
			smallInput[i-1] = input[i];
		}
		boolean answer = check(smallInput);
		if(!answer){
			return false;
		}
		if(input[0]<=input[1]){
			return true;
		}else{
			return false;
		}

	}

	public static boolean check2(int input[]){
		if(input.length<=1){
			return true;
		}
		//will check at 1st only is 1st element in array is lesser than 2nd element in array so that we dont have to check for rest
		//of n-1 elements 
		if(input[0]>input[1]){
			return false;
		}
		//if not greater then check for rest n-1 elements
		int smallInput[] = new int[input.length-1];
		for(int i=1;i<input.length;i++){
			smallInput[i-1] = input[i];
		}
		boolean answer = check2(smallInput);
		return answer;
		
	}
	public static void main(String[] args){
		int arr[] = {1,61,2,3};
		boolean ans = check2(arr);
		System.out.println(ans);
	}
}