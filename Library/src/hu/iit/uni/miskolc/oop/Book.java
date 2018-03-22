package hu.iit.uni.miskolc.oop;

import java.util.Date;

public class Book {
	private String title;
	private String author;
	private Date releaseYear;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void raisePrice(int percentage) {
		price*=(1+percentage/100.0);
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", releaseYear=" + releaseYear + ", price=" + price
				+ "]";
	}
	
}
