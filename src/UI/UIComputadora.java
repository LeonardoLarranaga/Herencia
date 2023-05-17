package UI;

import java.util.ArrayList;

import Herencia.*;

public class UIComputadora {

	public static void main(String[] args) {
		UICanvas ui = new UICanvas("Computadora.png", new Computadora("Apple", "A1502", "Apple", "Macbook Pro", 15000, new ArrayList<>(),
							new Microprocesador("Apple", "M1", "Apple", "Apple M1", 5000, new ArrayList<>(), 4096, 130400), 8000));
		ui.dibujar();
	}
}
