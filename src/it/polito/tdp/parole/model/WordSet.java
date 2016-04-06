package it.polito.tdp.parole.model;

import java.util.*;

public class WordSet {

	ArrayList<String> listaParole=new ArrayList<String>();
	
	
	public void generaParole(int numParole){
		for(int i=0; i<numParole; i++){
			listaParole.add("tag_"+ (i+1));
		//	System.out.println(i);
		}
		
	}
	public long cancella(int numero){
		long t0=System.nanoTime();
		listaParole.remove(numero);
		return(long)((System.nanoTime()-t0)/(1e9));
	}
	public List<String> elencoParole(){
		return listaParole;
	}
}
