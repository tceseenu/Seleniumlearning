package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,4,5,10,8,7};
		
		List<Integer> numsList= new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
		numsList.add(nums[i]);
		
		}
		//System.out.println(numsList);
		
		Collections.sort(numsList);
		System.out.println(numsList);
		int a=0;
		int b=0;
		for(int c=0;c<numsList.size();c++) {
			a=a+1;
			if(numsList.get(b)!=a) {
					
				System.out.println("Number Missing: "+a);
		}
			else {
				b=b+1;
				
			}
	}

	}}
