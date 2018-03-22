package hu.iit.uni.miskolc.oop;

public class Music {
	String artist;
	String title;
	int length;
	
	public Music(String artist, String titlr, int lenght){
		this.artist=artist;
		this.title=title;
		this.length=length;
	}
	@Override
	public String toString() {
		return artist+": "+title+", "+length+"perc";
		}
	
	public int compareLength(Music other){
		if(length>other.length){
			return 1;
		} else if(length<other.length){
			return -1;
		}
		return 0;
	}
	
	public boolean isartist(String artist){
		return this.artist.equalsIgnoreCase(artist);
	}
	
}
