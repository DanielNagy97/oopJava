package tartalyos;

import java.io.InputStream;
import java.util.Scanner;

public class Tartaly extends Tarolo{

	public Tartaly(int terfogat) {
		super(terfogat);
		this.terfogat=terfogata();
		// TODO Auto-generated constructor stub
	}
	
	int nyom�s;

	public Tartaly(int terfogat, int nyom�s) {
		super(terfogat);
		this.nyom�s = nyom�s;
	}
	
	public boolean veszelyese(){
		if(terfogat*nyom�s > 100){
			return true;
		}
		else{
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Tartaly [nyom�s=" + nyom�s + ", terfogat=" + terfogat + ", veszelyese()=" + veszelyese() + "]";
	}
	
	
	
	Scanner scanner = scanner(System.in);
	
	
	
	
	public boolean NagyobbNyomasu(){
		
		
		return false;
		
	}
	

	public class nagyobb{
		
	}
	

}
