package it.polito.tdp.parole.model;


public class Prova {

	
	public static void main(String[] args) {
		Parole words=new Parole();
		
		words.addParola("Anatra");
		words.addParola("cane");
		words.addParola("Barca");
		
		words.getElenco();
		System.out.println(words.getElenco());
		words.reset();
		System.out.println(words.getElenco());
	}

}
