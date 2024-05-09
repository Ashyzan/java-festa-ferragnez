package com.ferragnez.party;

public class Party {
	
//	Creare la classe Party che possa ospitare un array di invitati nel costruttore.
//	Fornire un metodo “accettaOspite” che prenda come parametro un nome e verifichi se
//	è all’interno dell’array di invitati.
	
	String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"  };
	
	public void accettaOspite(String nome) {
		
		// se il nome inserito è tra i partecipanti il guest è true
		
				boolean trovato = false;
				
				
				for (int i = 0; i < invitati.length; i++) {
					
					String currentName = invitati[i];
					
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
}
