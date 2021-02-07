// code to merge two sorted arrays and return sorted array

import java.util.Scanner;
public class MergeArrays{

	public static int[] merge(int arr1[],int arr2[]){
		int i=0;
		int j=0;
		int k=0;
		//create 3rd array of len arr1.length+arr2.lenth to store the merged arrays
		int arr3[] = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr3[k]=arr1[i];
				k++;
				i++;
			}else{
				arr3[k]=arr2[j];
				k++;
				j++;
			}
		}
			while(i<arr1.length){
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			while(j<arr2.length){
				arr3[k]=arr2[j];
				k++;
				j++;
			}
		return arr3;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//int arr1[] = {2,3,5};
		//int arr2[] ={1,4,6,7};
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++){
			arr1[i]= s.nextInt();
		}
		int m = s.nextInt();
		int arr2[] = new int[m];
		for(int j=0;j<arr2.length;j++){
			arr1[j]= s.nextInt();
		}
		
		int arr3[] = merge(arr1,arr2);
		for(int k=0;k<arr3.length;k++){
			System.out.println(arr3[k]);
		}
		
	}
}