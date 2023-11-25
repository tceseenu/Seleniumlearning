package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// Prime Number is  greater than 1 and can be divided by 1 or itself only
	int number=4;
	System.out.println("Given Number is :"+number);
	int count=0;
	for(int i=1;i<=number;i++) {
		if(number%i ==0) {
			count++;
		}
	}
	
	if(count==2)
	{
		System.out.println("Number: "+number +" is a Prime Number");
		
	}
	else {
		System.out.println("Number : "+number +" is not a Prime Number");
	}
	
}
	}
		
