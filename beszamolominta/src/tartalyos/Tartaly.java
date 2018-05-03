package tartalyos;

import java.io.InputStream;
import java.util.Scanner;

public class Tartaly extends Tarolo{

	public Tartaly(int terfogat) {
		super(terfogat);
		this.terfogat=terfogata();
		// TODO Auto-generated constructor stub
	}
	
	int nyomás;

	public Tartaly(int terfogat, int nyomás) {
		super(terfogat);
		this.nyomás = nyomás;
	}
	
	public boolean veszelyese(){
		if(terfogat*nyomás > 100){
			return true;
		}
		else{
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Tartaly [nyomás=" + nyomás + ", terfogat=" + terfogat + ", veszelyese()=" + veszelyese() + "]";
	}
	
	
	
	Scanner scanner = scanner(System.in);
	
	
	
	
	public boolean NagyobbNyomasu(){
		
		
		return false;
		
	}
	

	public class nagyobb{
		
	}
	

}
