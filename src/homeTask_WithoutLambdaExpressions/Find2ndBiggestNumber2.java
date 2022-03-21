package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find2ndBiggestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(33);
		numbers.add(13);
		numbers.add(88);
		numbers.add(44);
		numbers.add(56);
		//int secondLargestNum=secondLargest(numbers);
		int secondLargestNum=secondLargestNumber(numbers);
		System.out.println("secondLargest num is"+secondLargestNum);
	}
	
	public static int secondLargest(ArrayList<Integer> nums)
	{
		
	Collections.sort(nums);
	Collections.reverse(nums);
	return nums.get(1);
	}

	public static int secondLargestNumber(ArrayList<Integer> nums) {
		int temp = 0;
		int arr[] =new int[nums.size()];
		for(int i=0;i<nums.size();i++) {
			
			arr[i]=nums.get(i);
		}
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}	
		
	}
	
	return arr[arr.length-2];
	}

}
