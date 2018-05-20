package com.ganesh.ds.arrayAndString;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String str = "ahh hjhj ";
		int n = lengthOfLastWord(str);
		System.out.println(n);

	}
	
	public static int lengthOfLastWord(String str) {
		if(str == null || str.isEmpty()) {
			return 0;
		}
		
		char[] arr = str.toCharArray();
		int a = arr.length-1;
		for(int i=a;i>=0;i--) {
			if(arr[i]!=' ') {
				break;
			}
			a--;
		}
		
		/*if(arr[arr.length-1]==' ') {
			return 0;
		}*/
		
		if(a<0) {
			return 0;
		}
		
		int index = 0;
		for(int i=a;i>=0;i--) {
			if(arr[i] == ' ') {
				return index;
			}
			index++;
		}
		return index;
	}

}
