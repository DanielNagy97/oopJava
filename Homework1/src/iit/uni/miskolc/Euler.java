package iit.uni.miskolc;

public class Euler {

	public static void main(String[] args) {
		double e = 0.0;
		double f = 1;
		
		for (double i = 0; i < 100; i++) {
			
			for (double j = 1; j<=i ; j++) {
				f = f*j;
			}
			
			e += (1/f);
			f = 1;
		}
		System.out.println(e);
	}

}
