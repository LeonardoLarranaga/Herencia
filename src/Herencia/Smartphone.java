package Herencia;
import java.util.ArrayList;

public class Smartphone extends Computadora {

	private final Sensor sensorDeHuella;
	private final Pantalla pantalla;

	public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes, Microprocesador cpu, long ramMB, Sensor sensorDeHuella,
			Pantalla pantalla) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes, cpu, ramMB);
		this.sensorDeHuella = sensorDeHuella;
		this.pantalla = pantalla;
		agregarComponente(this.sensorDeHuella);
		agregarComponente(this.pantalla);
	}

	public Smartphone(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.sensorDeHuella = new Sensor(fabricante, numeroSerie, marca, nombre);
		this.pantalla = new Pantalla(fabricante, numeroSerie, marca, nombre);
	}

	public Sensor getSensorDeHuella() {
		return sensorDeHuella;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	@Override
	public String toString() {
		return "Smartphone: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:" + getNumeroSerie()
				+ "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: " + getComponentes()
				+ "\nEncendido: " + isEncendido() + "\nRAM: " + getRamMB();
	}
}
