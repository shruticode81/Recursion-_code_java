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

	private static boolean checkSortedBetter(int input[],int startIndex){
		//basecase will then there is one element left or no element left 
		if(startIndex>=input.length-1){
			return true;
		}
		if(input[startIndex]>input[startIndex+1]){
			return false;
		}
		boolean smallans = checkSortedBetter(input,startIndex+1); // input[] array will be the same
		return smallans;
	}

	public static boolean checkSortedBetter(int input[]){ //we are doing function overloading here. as user donot know about startindex
		return checkSortedBetter(input,0);
	}
	public static void main(String[] args){
		int arr[] = {1,61,2,3};
		boolean ans = checkSortedBetter(arr);
		System.out.println(ans);
	}
}