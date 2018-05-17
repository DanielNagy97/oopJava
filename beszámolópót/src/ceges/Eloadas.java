package ceges;

public class Eloadas extends Rendezveny{


	private String eloado;
	private int oradij;
	
	
	
	public Eloadas(String megnevezes, int hossz, String eloado, int oradij) {
		super(megnevezes, hossz);
		this.eloado = eloado;
		this.oradij = oradij;
	}



	public Eloadas(String megnevezes, String eloado, int oradij) {
		super(megnevezes);
		this.eloado = eloado;
		this.oradij = oradij;
	}

	@Override
	public int rendevenyAra() {
		return gethossz()*oradij;
	}
	
	public boolean hosszabb(Eloadas eloadas){
		return gethossz()>eloadas.gethossz();
	}
	
	public static Eloadas kisebbAr(Eloadas eloadas1, Eloadas eloadas2){
		
		if(eloadas1.oradij<eloadas2.oradij){
		return eloadas1;
		}
		else{
			return eloadas2;
		}
		
	}
	
	
}
