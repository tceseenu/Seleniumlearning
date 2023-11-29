package week2.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// To compare two arrays and print matching items
		int[] FirstArray= {3,2,11,4,6,7};
		int[] SecondArray={1,2,8,4,9,7};
	   System.out.println("Size of the First Array: "+FirstArray.length);
		System.out.println(FirstArray[3]);
		Arrays.sort(FirstArray);
		for(int i=0;i<FirstArray.length;i++) 
		{
			System.out.println(FirstArray[i]);
		}
		System.out.println("Size of the Second Array: "+SecondArray.length);
	   System.out.println(SecondArray[0]);
	   Arrays.sort(SecondArray);
		for(int j=0;j<SecondArray.length;j++) 
		{
			System.out.println(SecondArray[j]);

			}
 for(int i=0;i<FirstArray.length;i++) {
	 for(int j=0;j<SecondArray.length;j++) {
		 if(FirstArray[i]==SecondArray[j]) {
		 System.out.println("Intersection value of First Array : "+FirstArray[i]);
		 }
	 }
		 
		 
	 
 }
		}
	}
