package com.everis.tallerjava.testing;

import com.everis.tallerjava.clasepadre.Liquido;
import com.everis.tallerjava.claseshijas.Cafe;
import com.everis.tallerjava.claseshijas.Leche;
import com.everis.tallerjava.general.Taza;


public class TestPolimor {

	public static void main(String[] args) {
		
		Liquido liquidoGeneral = new Liquido();
		Cafe liquidoCafe = new Cafe();
		Leche liquidoLeche = new Leche();
		
		Taza miTaza = new Taza();
		
		miTaza.agregarLiquido(liquidoGeneral);
		miTaza.agregarLiquido(liquidoCafe);
		miTaza.agregarLiquido(liquidoLeche);

	}

}
