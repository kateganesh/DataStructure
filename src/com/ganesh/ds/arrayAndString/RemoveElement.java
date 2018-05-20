package com.ganesh.ds.arrayAndString;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,3,5,6};
		int n = removeElement(nums,3);
		System.out.println(n);

	}
	
	public static int removeElement(int[] nums, int val) {
		int index=0,b=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==val) {
				continue;
			}
			else {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}

}
