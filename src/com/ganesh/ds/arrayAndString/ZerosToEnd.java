package com.ganesh.ds.arrayAndString;

public class ZerosToEnd {

	public static void main(String[] args) {
		
		int[] arr = {2,5,44,0,4,0,2,3,0,5,0,21,0};
		dipslayArray(arr);
		zeroToEnd(arr);
		System.out.println("$$$$$$$$$$$");
		dipslayArray(arr);

	}

	public static void dipslayArray(int[] arr) {
		System.out.println();
		for (int i : arr) {
			System.out.print(" "+i);
		}
		System.out.println();
		
	}

	public static void zeroToEnd(int[] arr) {
		int front = 0, end,temp;
		end = arr.length-1;
		 while(front <= end) {
			 if(arr[front] == 0 && arr[end] != 0) {
				 temp = arr[front];
				 arr[front] = arr[end];
				 arr[end] = temp;
				 front++;
				 end--;
			 }
			 if(arr[front]!=0) {
				 front++;
			 }
			 if(arr[end]==0) {
				 end--;
			 }
		 }
		
	}

}
