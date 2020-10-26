package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		//Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.CONFIRMATION); //Aparece um �cone com 
															// a letra 'I' de Information e os bo�es 'OK' e 'CANCEL'
		
		//Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.ERROR); //Aparece um �cone vermelho com 
															//a letra 'X' e o bot�o 'OK'
		
		Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR); //Fica mais enxuto pois n�o tem o Header
	}
}
