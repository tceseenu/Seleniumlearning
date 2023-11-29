package week2.day2;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		
		int[] Nums= {1,4,3,2,8,6,7};
		int b=0;
		Arrays.sort(Nums);
	for(int a=0;a<Nums.length;a++) {
		System.out.println(Nums[a]);
	}
	int ls = Nums.length;
	
	for(int c=0;c<ls; c++) {
		if(Nums[b]!=c) {
		
			System.out.println("Numbers missing in an Array: " +c);
			
				}
		else {
			b=b+1;
		}
	}
	
	}		
	}


