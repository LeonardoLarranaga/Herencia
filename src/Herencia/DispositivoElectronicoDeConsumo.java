package Herencia;
import java.util.ArrayList;

public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {

	private boolean encendido;

	public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre,
			double costo, ArrayList<ComponenteElectronico> componentes) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.encendido = false;
	}

	public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre,
			double costo, ArrayList<ComponenteElectronico> componentes, boolean encendido) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.encendido = encendido;
	}

	public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.encendido = false;
	}

	public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre,
			boolean encendido) {
		super(fabricante, numeroSerie, marca, nombre);
		this.encendido = encendido;
	}

	public void apagar() {
		this.encendido = false;
	}

	public void encender() {
		this.encendido = true;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public boolean isEncendido() {
		return this.encendido;
	}

	@Override
	public String toString() {
		return "Dispositivo electrónico de consumo: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:"
				+ getNumeroSerie() + "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: "
				+ getComponentes() + "\nEncendido: " + isEncendido();
	}
}
