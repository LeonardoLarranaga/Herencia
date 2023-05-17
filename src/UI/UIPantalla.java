package UI;

import java.util.ArrayList;

import Herencia.Pantalla;

public class UIPantalla {
	public static void main(String[] args) {
		UICanvas canvas = new UICanvas("Pantalla.png", new Pantalla("Samsung", "14ProOLED", "Apple", "iPhone 14 Pro Screen", 12000, new ArrayList<>(), 2556, 1179));
		canvas.dibujar();
	}
}
