package UI;

import java.util.ArrayList;

import Herencia.*;

public class Ejemplo {
	public static final Computadora computadora = new Computadora("Apple", "A1502", "Apple", "Macbook Pro", 15000, new ArrayList<>(),
			new Microprocesador("Apple", "M1", "Apple", "Apple M1", 5000, new ArrayList<>(), 4096, 130400), 8000);
	
	public static final Microprocesador microprocesador = new Microprocesador("Apple", "A26502023", "Apple", "A16 Bionic", 3500, new ArrayList<>(), 1024, 15000);
	
	public static final Pantalla pantalla = new Pantalla("Samsung", "14ProOLED", "Apple", "iPhone 14 Pro Screen", 12000, new ArrayList<>(), 2556, 1179);
	
	public static final Sensor sensor = new Sensor("Apple", "2020", "Apple", "Touch ID", 5000, new ArrayList<>(), "Huella", "Huella", 10);
	
	public static final Smartphone smartphone = new Smartphone("Apple", "A2176", "Apple", "iPhone 12 mini", 8925, new ArrayList<>(),
			new Microprocesador("Apple", "A142020", "Apple", "A14 Bionic", 1500, new ArrayList<>(), 1024, 15000), 4096, 
			new Sensor("Apple", "2020", "Apple", "Touch ID", 5000, new ArrayList<>(), "Huella", "Huella", 10), 
			new Pantalla("Samsung", "12mini", "Apple", "iPhone 12 mini Screen", 3000, new ArrayList<>(), 2340, 1080));
	
	public static final Television television = new Television("Samsung", "2023OLED", "Samsung", "4K Samsung Smart TV", 20000, new ArrayList<>(),
			new Pantalla("Samsung", "75INCHTV4KSmart", "Samsung", "75\" 4K TV", 10000, new ArrayList<>(), 4096,
					2160));
}
