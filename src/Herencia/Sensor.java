package Herencia;
import java.util.ArrayList;

public class Sensor extends ComponenteElectronico {
	private final String tipo;
	private final String unidadDeMedida;
	private final int valor;

	public Sensor(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes, String tipo, String unidadDeMedida, int valor) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.tipo = tipo;
		this.unidadDeMedida = unidadDeMedida;
		this.valor = valor;
	}

	public Sensor(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.tipo = "";
		this.unidadDeMedida = "";
		this.valor = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Sensor: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:" + getNumeroSerie()
				+ "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: " + getComponentes()
				+ "\nTipo: " + getTipo() + "\nUnidad de medida: " + getUnidadDeMedida() + "\nValor: " + getValor();
	}
}
