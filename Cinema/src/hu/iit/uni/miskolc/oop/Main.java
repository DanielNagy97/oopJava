package hu.iit.uni.miskolc.oop;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		
		Random rnd = new Random();
		
		ModelClassForFilms[] movies = new ModelClassForFilms[arraySize];

		ModelClassForFilms[] oscarMovies = new OscarWinnerFilms[arraySize];

		for (int i = 0; i < arraySize; i++) {

			movies[i] = new ModelClassForFilms("movietitle" + rnd.nextInt(5), "asd", Category.SCIFI, rnd.nextInt(20) + 2000,

					new String[] { "Nagy Daniel" });



		}

		for (int i = 0; i < arraySize; i++) {

			try {

				oscarMovies[i] = new OscarWinnerFilms("movietitle" + rnd.nextInt(6), "fsa", Category.ROMCOM,

						rnd.nextInt(10) + 2000, new String[] { "Satan Adam" }, rnd.nextInt(10) + 2000,

						"legjobb valami");

			} catch (InvalidWinnigYearException e) {

				System.out.println(e.getMessage());

				i--;

			}

		}

		boolean notFound = true;

		for (MovieImpl movieImpl : movies) {

			if (movieImpl.getTitle().equalsIgnoreCase("movietitle1")) {

				System.out.println(movieImpl);

				notFound = false;

			}

		}



		for (MovieImpl movieImpl : oscarMovies) {

			if (movieImpl.getTitle().equalsIgnoreCase("movietitle1")) {

				System.out.println(movieImpl);

				notFound = false;

			}

		}

		System.out.println(getOlderMovie(movies[0], oscarMovies[0]));

		displayMoviesByName("movietitle4", oscarMovies);

		displayMoviesByYear(2005, oscarMovies);

	}



	private static Movie getOlderMovie(MovieImpl first, MovieImpl second) {

		if (first.getYear() < second.getYear()) {

			return first;

		}

		return second;

	}



	private static void displayMoviesByName(String name, MovieImpl[] movies) {

		for (int i = 0; i < movies.length; i++) {

			if (movies[i].getTitle().equalsIgnoreCase(name)) {

				System.out.println(movies[i]);

			}

		}

	}



	private static void displayMoviesByYear(int year, MovieImpl[] movies) {

		for (int i = 0; i < movies.length; i++) {

			if (movies[i].getYear() == year) {

				System.out.println(movies[i]);

			}

		}

	}



}