// code binary search in recusion
import java.util.Scanner;
public class BinarySearch{
	public static int binaryhelper(int input[],int si,int ei,int element){
		//base case if array size is 0 si>ei ,,if element is not found
		if(si>ei){
			return -1;
		}
		int mid = (si+ei)/2;
		if(input[mid]==element){
			return mid;
		}
		else if(input[mid]>element){
			return binaryhelper(input,si,mid-1,element);
		}
		else {
			return binaryhelper(input,mid+1,ei,element);
		}
	}
	public static int binary(int input[],int element){
		return binaryhelper(input,0,input.length-1,element);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int x = s.nextInt();
		int position = binary(arr,x);
		System.out.println(position);
	}
}