package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime = 5;
		int i,j;
		j=0;
		for(i=1;i<=prime;i++) {
			if(prime%i==0) {
				j=j+1;
			}			
		}
		if (j==2) {
			System.out.println(prime+" is a PRIME number");
		} else {
			System.out.println(prime+" is a not a PRIME number");
		}


}}
