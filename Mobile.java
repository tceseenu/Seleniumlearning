package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="Redmi";
		float mobileWeight=15f;
		System.out.println("MOBILE MODEL:"+mobileModel);
		System.out.println("MOBILEWEIGHT :"+mobileWeight);
		
	}
	public void sendMsg() {
		boolean isCharged=true;
		int mobileCost=5000;
		System.out.println(isCharged);
		System.out.println("MOBILE COST IS : "+mobileCost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();

	}

}
