package ceges.teszt;

import java.util.Scanner;

import ceges.Eloadas;

public class RendezvenyTeszt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Eloadas[] eloadastomb = new Eloadas[5];
		
		for (int i = 0; i < eloadastomb.length; i++) {
			eloadastomb[i] = new Eloadas(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));		
		}
		
		for(Eloadas eloadas : eloadastomb){
			System.out.println(eloadas+" a rendezvény ára: "+eloadas.rendevenyAra());
		}
		
		
		int sum = 0;
		for (int i = 0; i < eloadastomb.length; i++) {
			sum+=eloadastomb[i].rendevenyAra();
		}
		System.out.println("Az 5 elõadás ára: "+sum);
		
		Eloadas minAr = Eloadas.kisebbAr(eloadastomb[0], eloadastomb[1]);
		for (int i = 2; i < eloadastomb.length; i++) {
			minAr = Eloadas.kisebbAr(minAr, eloadastomb[i]);
		}
		
		System.out.println(minAr);
		
		

	}

}
