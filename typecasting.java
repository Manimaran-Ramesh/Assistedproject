package assisstedproject;

public class typecasting {
	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");
		char k1='A';
		System.out.println("Value of k1: "+k1);
		
		int k2=k1;
		System.out.println("Value of k2: "+k2);
		
		float k3=k1;
		System.out.println("Value of k3: "+k3);
		
		long k4=k1;
		System.out.println("Value of k4: "+k1);
		
		double k5=k1;
		System.out.println("Value of k5: "+k5);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}

