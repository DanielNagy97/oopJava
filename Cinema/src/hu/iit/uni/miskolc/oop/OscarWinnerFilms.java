package hu.iit.uni.miskolc.oop;

public class OscarWinnerFilms extends ModelClassForFilms {


	private int WinningYear;
	private Category WinningCategory;
	
	public OscarWinnerFilms(String title, String producer, hu.iit.uni.miskolc.oop.Category category, int year,
			String stars, int winningYear, hu.iit.uni.miskolc.oop.Category winningCategory) {
		super(title, producer, category, year, stars);
		this.WinningYear = year;
		this.WinningCategory = category;
	}

	@Override
	public String toString() {
		return "OscarWinnerFilms [WinningYear=" + WinningYear + ", WinningCategory=" + WinningCategory + "]";
	}
		
}
