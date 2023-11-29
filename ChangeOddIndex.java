package week2.day2;

import java.util.stream.IntStream;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="changeme";
		String odd="";
		int i=0;
		for(int k=0;k<str.length();k++){
			if(i!=k) {
				odd=odd+Character.toUpperCase(str.charAt(k));
				i=i+2;
							}
			else {
				odd=odd+str.charAt(k);			}
			
		}
		System.out.println(odd);
		
	      }


	}

