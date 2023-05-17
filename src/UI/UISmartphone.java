package UI;

import java.util.ArrayList;
import Herencia.*;

public class UISmartphone {	
	public static void main(String[] args) {
		UICanvas canvas = new UICanvas("Smartphone.png", 
							new Smartphone("Apple", "A2176", "Apple", "iPhone 12 mini", 8925, new ArrayList<>(),
							new Microprocesador("Apple", "A142020", "Apple", "A14 Bionic", 1500, new ArrayList<>(), 1024, 15000), 4096, 
							new Sensor("Apple", "2020", "Apple", "Touch ID", 5000, new ArrayList<>(), "Huella", "Huella", 10), 
							new Pantalla("Samsung", "12mini", "Apple", "iPhone 12 mini Screen", 3000, new ArrayList<>(), 2340, 1080)));
		
		canvas.dibujar();
	}
}
