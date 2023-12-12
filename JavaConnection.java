package week4.day1;

public  class JavaConnection implements DatabseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("To verify the Connection");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("To Verify the executeUpdate");
	}

	//public abstract void testing();
	
	
	public static void main(String[] args) {
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.executeUpdate();
		obj.disconnect();
		
		
		
	}
}

