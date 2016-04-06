package it.polito.tdp.parole.model;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*********STUB CLASS*************/
public class Parole {
	
	private List<String> parole=new LinkedList<String>();
	int i=0;
	
	public Parole() {
		
	}
	
	public void addParola(String p) {
		i++;
		System.out.println("step "+i);
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole ;
	}
	
	public void reset() {
		parole.clear();
	}

}
