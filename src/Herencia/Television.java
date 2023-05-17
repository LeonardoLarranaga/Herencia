package Herencia;
import java.util.ArrayList;

public class Television extends DispositivoElectronicoDeConsumo {
	private final Pantalla pantalla;

	public Television(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes, Pantalla pantalla) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.pantalla = pantalla;
		agregarComponente(this.pantalla);
	}

	public Television(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.pantalla = new Pantalla(fabricante, numeroSerie, marca, nombre);
		agregarComponente(this.pantalla);
	}

	public Pantalla getPantalla() {
		return this.pantalla;
	}

	@Override
	public String toString() {
		return "Televisión: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:" + getNumeroSerie()
				+ "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: " + getComponentes()
				+ "\nEncendido: " + isEncendido();
	}
}
