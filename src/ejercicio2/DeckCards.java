package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
//Define los palos y los valores de las cartas
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();//Almacenar las cartas del mazo
//Para generar todas las combinaciones de palos y valores posibles
		for (int i = 0; i < suits.length; i++) {//El palo del mazo
			for (int j = 0; j < values.length; j++) {//El valor del mazo
				//Crea una nueva carta con el palo y el valor correspondido
				Card card = new Card(suits[i], values[j]);
				deck.add(card);//Añade la carta al mazo
			}
		}
//Mezclar las cartas 
		for (int i = 0; i < deck.size(); i++) {
			//Genera aleatorio j entre 0 y i
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
//Imprime las primeras 5 cartas del mazo (Despues de barajarlas)
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
