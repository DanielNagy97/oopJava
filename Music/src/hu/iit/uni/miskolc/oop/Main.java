package hu.iit.uni.miskolc.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Music[] songs = new Music[scanner.nextInt()];
		for (int i = 0; i < songs.length; i++) {
			songs[i] = new Music("Elõadó", "Cím", 666*i/12);
		}
		
		Music longestSong = songs[0];
		for (int j = 0; j < songs.length; j++) {
			if(longestSong.compareLength(songs[j])==-1){
				longestSong = songs[j];
			}
			
			}
		
		System.out.println("Leghosszabb zene"+longestSong);
		
		System.out.println("Adjon meg egy elõadót");
		String artist = scanner.nextLine();
		for (Music music : songs){
			if (music.isartist(artist)){
				System.out.println(music);
			}
		}
	}

}
