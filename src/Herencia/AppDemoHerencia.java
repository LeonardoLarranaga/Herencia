package Herencia;
import java.util.ArrayList;

public class AppDemoHerencia {

	public static void main(String[] args) {
		ArrayList<Smartphone> listaDeSmartphones = new ArrayList<Smartphone>();
		ArrayList<Television> listaDeTVs = new ArrayList<Television>();

		listaDeSmartphones.add(new Smartphone("Apple", "A2176", "Apple", "iPhone 12 mini", 8925, new ArrayList<>(),
				new Microprocesador("Apple", "A142020", "Apple", "A14 Bionic", 1500, new ArrayList<>(), 1024, 15000),
				4096, new Sensor("Apple", "2020", "Apple", "Touch ID", 5000, new ArrayList<>(), "Huella", "Huella", 10),
				new Pantalla("Samsung", "12mini", "Apple", "iPhone 12 mini Screen", 3000, new ArrayList<>(), 2340,
						1080)));

		listaDeSmartphones.add(new Smartphone("Apple", "A2650", "Apple", "iPhone 14 Pro", 23000, new ArrayList<>(),
				new Microprocesador("Apple", "A26502023", "Apple", "A16 Bionic", 3500, new ArrayList<>(), 1024, 15000),
				4096, new Sensor("Apple", "2022", "Apple", "Face ID", 5000, new ArrayList<>(), "Cara", "3D", 2042),
				new Pantalla("Samsung", "14ProOLED", "Apple", "iPhone 14 Pro Screen", 12000, new ArrayList<>(), 2556,
						1179)));

		listaDeTVs.add(new Television("Pioneer", "2021FireTV", "Pioneer", "4K Fire TV", 6000, new ArrayList<>(),
				new Pantalla("Pioneer", "202143inch", "Pioneer", "43\" 4K TV", 4000, new ArrayList<>(), 4096, 2160)));

		listaDeTVs.add(new Television("Samsung", "2023OLED", "Samsung", "4K Samsung Smart TV", 20000, new ArrayList<>(),
				new Pantalla("Samsung", "75INCHTV4KSmart", "Samsung", "75\" 4K TV", 10000, new ArrayList<>(), 4096,
						2160)));

		for (Smartphone smartphone : listaDeSmartphones) {
			System.out.println(smartphone.toString() + "\n\n");
		}

		for (Television television : listaDeTVs) {
			System.out.println(television.toString() + "\n\n");
		}
	}

}
