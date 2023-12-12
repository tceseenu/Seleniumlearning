package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={3, 2, 11, 4, 6, 7};
		int[] b={1, 2, 8, 4, 9, 7};
		List<Integer> nums=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		nums.add(a[i]);
			}
		Collections.sort(nums);
		System.out.println(nums);
		
		List<Integer> number=new ArrayList<Integer>();
		for(int j=0;j<b.length;j++) {
		number.add(b[j]);
			}
		Collections.sort(number);
		System.out.println(number);
		nums.retainAll(number);
		System.out.println("Common Elements in this List:"+nums);

		
	}
	}


