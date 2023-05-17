package UI;

import java.util.ArrayList;

import Herencia.Microprocesador;

public class UIMicroprocesador {
	public static void main(String[] args) {
		UICanvas canvas = new UICanvas("Microprocesador.png", 
						  new Microprocesador("Apple", "A26502023", "Apple", "A16 Bionic", 3500, new ArrayList<>(), 1024, 15000));
		canvas.dibujar();
	}
}
