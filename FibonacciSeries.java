package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1);
		int range=8;
		for (int i=1;i<=range;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
					System.out.println(""+sum);
				
				
		}
		
			
		}

	}


