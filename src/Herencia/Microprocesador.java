package Herencia;
import java.util.ArrayList;

public class Microprocesador extends ComponenteElectronico {
	private final int cacheRAM;
	public final long velocidadHz;

	public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes, int cacheRAM, long velocidadHz) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.cacheRAM = cacheRAM;
		this.velocidadHz = velocidadHz;
	}

	public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.cacheRAM = 0;
		this.velocidadHz = 0;
	}

	public int getCacheRAM() {
		return cacheRAM;
	}

	public long getVelocidadHz() {
		return velocidadHz;
	}

	@Override
	public String toString() {
		return "Microprocesador: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:" + getNumeroSerie()
				+ "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: " + getComponentes()
				+ "\nCaché RAM: " + getCacheRAM() + "\nVelocidad Hz: " + getVelocidadHz();
	}
}
