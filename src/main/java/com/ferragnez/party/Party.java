package com.ferragnez.party;

public class Party {

	// attributi classe
	private String nomeInvitato;
	
	private String [] listaInvitati;

	
	
	// costruttore 1
	public Party( String [] invitati) {

		listaInvitati = invitati ;
	}
	

	
	public void accettaOspiti(String nome) {
		
		
	// se il nome inserito è tra i partecipanti il guest è true
		
		boolean trovato = false;
		
		
		for (int i = 0; i < listaInvitati.length; i++) {
			
			String currentName = listaInvitati[i];
			
			//System.out.println(invitati[i]);
			if (currentName.equals(nome)) {
				
				trovato = true;
				break;
				
				
			}
			
			}
		
		if (trovato) {
			
			System.out.println("Benvenuto! Puoi accedere");
		}
		
		else {
			
			System.out.println("Spiacente non sei tra i partecipanti! Non puoi entrare");
			
		} 

	}

//	State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di 
//	assicurarvi che accedano alla festa solo gli invitati presenti sulla lista. Lista invitati: 
//	Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, 
//	Pardis Zarei, Martina Maccherone, Rachel Zeilic

//	OOP:
//		Creare la classe Party che possa ospitare un array di invitati nel costruttore.
//		Fornire un metodo “accettaOspite” che prenda come parametro un nome e verifichi se
//		è all’interno dell’array di invitati.

//	BONUS:
//		Nella classe Party bisogna dare l’opportunità a Fedez di escludere Luis, quindi 
//		predisporre una funzione che possa sovrascrivere il nome di Luis con un invitato 
//		qualunque (uno nuovo) se e solo se c’è un valore booleano isLuisAntipatico = true 
//		(dovete trovare il modo di predisporlo nel posto giusto e valorizzarlo nel modo giusto).

}
