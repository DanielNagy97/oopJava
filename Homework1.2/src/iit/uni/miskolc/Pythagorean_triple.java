package iit.uni.miskolc;

public class Pythagorean_triple {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c=0;
		
		int m = 2;
		
		while (c < 100) {
			
			for (int n = 1; n < m; ++n) {
				a = m*m - n*n;
	            b = 2*m*n;
	            c = m*m + n*n;
	            
	            if (c>100)
	            	break;
	            System.out.printf("%d,%d,%d\n",a , b , c);
			}
			m++;
			
		}
		
	}

}
