package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number={3,2,11,4,6,7};
		List<Integer> nums=new ArrayList<Integer>();
		for(int i=0;i<number.length;i++) {
			nums.add(number[i]);
			
		}
		System.out.println(nums);
		//Collections.sort(nums,Collections.reverseOrder());
		Collections.sort(nums);
		Collections.reverse(nums);
		System.out.println(nums);
		Integer second = nums.get(1);
		System.out.println(second);
		
		
		

	}

}
