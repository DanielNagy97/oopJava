package ceges;

public abstract class Rendezveny {
	
	private String megnevezes;
	private int hossz;
	
	public Rendezveny(String megnevezes, int hossz) {
		super();
		this.megnevezes = megnevezes;
		this.hossz = hossz;
	}

	public Rendezveny(String megnevezes) {
		super();
		this.megnevezes = megnevezes;
		this.hossz=60;
	}

	@Override
	public String toString() {
		return "Megnevezes=" + megnevezes + ", hossz=" + hossz;
	}
	
	public int gethossz(){
		return hossz;
	}
	
	public String getmegnevezes(){
		return megnevezes;
	}
	
	public abstract int rendevenyAra();
	
	
	
	
	

}
