package UI;

import java.util.ArrayList;

import Herencia.Pantalla;
import Herencia.Television;

public class UITelevision {
	public static void main(String[] args) {
		UICanvas canvas = new UICanvas("Television.png", new Television("Samsung", "2023OLED", "Samsung", "4K Samsung Smart TV", 20000, new ArrayList<>(),
				new Pantalla("Samsung", "75INCHTV4KSmart", "Samsung", "75\" 4K TV", 10000, new ArrayList<>(), 4096,
						2160)));
		canvas.dibujar();
	}
}
