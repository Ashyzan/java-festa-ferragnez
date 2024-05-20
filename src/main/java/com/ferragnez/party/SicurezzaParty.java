package com.ferragnez.party;

import java.util.Scanner;

public class SicurezzaParty {

//	Creare una classe SicurezzaParty che chieda all’utente il nome e invochi le funzioni di 
//	Party per verificare se è accettato o meno.
//	

	public static void main(String[] args) {
		
		Party myFerragnezParty = new Party({"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"  });
		
		// metodo Scanner permette di prendere un input dalla tastiera
		Scanner input = new Scanner(System.in);
		
// apre il field per inserimento dati utente
		System.out.println("Ciao e benvenuto alla festa Ferragnez! Inserisci il tuo nome e cognome");
		
		// attribuisce alla variabile nome l'input inserito dall'utente
		String nomeGuest = input.nextLine();
		
		ferragnez.accettaOspiti(nomeGuest);
		

	
			
	}

}
