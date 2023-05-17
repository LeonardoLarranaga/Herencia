package UI;

import java.util.ArrayList;

import Herencia.Sensor;

public class UISensor {
	public static void main(String[] args) {
		UICanvas canvas = new UICanvas("Sensor.png", new Sensor("Apple", "2020", "Apple", "Touch ID", 5000, new ArrayList<>(), "Huella", "Huella", 10));
		canvas.dibujar();
	}
}
