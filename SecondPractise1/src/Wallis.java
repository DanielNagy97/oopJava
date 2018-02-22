import java.util.Arrays;
import java.util.Random;

public class Wallis {

	public static void main(String[] args) {
		double pi = 1;
		for (double i = 1; i < 10000; i++) {
			pi*=((2*i/(2*i-1)*(2*i)/(2*i+1)));
		}
		System.out.println(pi*2);
		
		pi=0.0;
		for (double i = 0; i < 10000; i++) {
			pi+=(Math.pow(-1, i)/(2*i+1));
		}
		System.out.println(pi*4);
		System.out.println(factor(6));
		System.out.println(factor2(6));
		System.out.println(isPrime(15));
		for (int i=1; i <=100;i++){
			for (int j = 0; j <= 100; j++) {
				if (isPrime(i) && isPrime(j) && i+2 ==j){
					System.out.println("i= " + i + ", j= " + j);
				}
			}
		}
		
		int i=0;
		while (true) {
			if(i==5){
				break;
			}
			else{
				System.out.print(i);
			}
			System.out.println();
			i++;
		}
		
		int[] array ={0,0,0,0,0,0,0,0,0,0};
		Random rnd = new Random();
		for (i = 0; i < array.length; i++) {
			array[i]=rnd.nextInt(100)+1;
			System.out.println(array[i]);
		}
		System.out.println("Linear Search result :"+LinearS(35, array));
		Arrays.sort(array);
		
	}
	
	private static int[] sort(int[] array) {
		int[] sortedArray = {0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}
	
	
	
	
	private static int LinearS(int value, int[] array){
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value)
				return i;
		}
	}
	
	private static int factor(int n){
		int factor=1;
		for (int i = 1; i <= n; i++) {
			factor*=i;
		}
		return factor;
	}
	
	
	private static int factor2(int n) {
		if(n==6){
			return 1;
		}
		else{
			return n * factor2(n-1);
		}
	}
	private static boolean isPrime(int n){
		for (int i=2; i<n ;i++){
			if (n % i ==0)
				return false;
		}
		return true;
	}
	

}


