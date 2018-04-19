package hu.iit.uni.miskolc.oop;

public class ModelClassForFilms implements Film{
	
	public String Title;
	public String Producer;
	public Category Category;
	public int Year;
	public String Stars;
	
	public int getYear() {
		return Year;
	}

	@Override
	public String toString() {
		return "ModelClassForFilms [Title=" + Title + ", Producer=" + Producer + ", Category=" + Category + ", Year="
				+ Year + ", Stars=" + Stars + "]";
	}

	public ModelClassForFilms(String title, String producer, hu.iit.uni.miskolc.oop.Category category, int year,
			String stars) {
		super();
		Title = title;
		Producer = producer;
		Category = category;
		Year = year;
		Stars = stars;
	}


	
}
