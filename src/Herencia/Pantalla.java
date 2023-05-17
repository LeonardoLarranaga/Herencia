package Herencia;
import java.util.ArrayList;

public class Pantalla extends ComponenteElectronico {
	private final int resolucionX;
	private final int resolucionY;

	public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes, int resolucionX, int resolucionY) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.resolucionX = resolucionX;
		this.resolucionY = resolucionY;
	}

	public Pantalla(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.resolucionX = 1920;
		this.resolucionY = 1080;
	}

	public int getResolucionX() {
		return resolucionX;
	}

	public int getResolucionY() {
		return resolucionY;
	}

	@Override
	public String toString() {
		return "Pantalla: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:" + getNumeroSerie()
				+ "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: " + getComponentes()
				+ "\nResolución: " + getResolucionX() + "x" + getResolucionY();
	}
}
