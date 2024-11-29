package ejercicio2;

public class Card {

	public String suit;//El palo de las cartas
	public String value;//El valor de las cartas
	
	public Card (String suit, String value) {//Se introducen los dos parámetros para que inicie
		this.suit = suit;//Inicia el palo de las cartas
		this.value = value;//Inicia el valor de las cartas
	}
	
	public String toString () {//Vuelve la cadena
		return (this.suit+"-"+this.value);//Se muestra el palo y el valor
	}
}
	