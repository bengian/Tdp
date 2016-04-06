package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.WordSet;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	WordSet ws=new WordSet();
	Parole elenco ;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnCancella;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML
    void doInsert(ActionEvent event) {
    	String testo="";
    	int numero= Integer.parseInt(txtParola.getText());
    	
    	ws.generaParole(numero);
 
    	long t0=System.nanoTime();
		ws.cancella(0);
		
		long t1=System.nanoTime();
		int middle=(int)((ws.elencoParole().size())/2);
		ws.cancella(middle);
	
		long t2=System.nanoTime();
		ws.cancella(ws.elencoParole().size()-1);
		
		testo="Remove first: "+(System.nanoTime()-t0)/1e9+"\n"+"Remove middle: "
				+(System.nanoTime()-t1)/1e9+"\n"+"Remove last: "+(System.nanoTime()-t2)/1e9;
		txtResult.setText(testo);
	
    		
    	}
    	
    	
    
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	elenco.reset() ;
    	txtResult.clear() ;

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";

        elenco = new Parole() ;
        
    }
}
