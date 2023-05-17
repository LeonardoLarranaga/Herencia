package Herencia;
import java.util.ArrayList;

public class Computadora extends DispositivoElectronicoDeConsumo {

	private Microprocesador cpu;
	private long ramMB;

	public Computadora(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes, Microprocesador cpu, long ramMB) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
		this.cpu = cpu;
		this.ramMB = ramMB;
		agregarComponente(this.cpu);
	}

	public Computadora(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
		this.cpu = new Microprocesador(fabricante, numeroSerie, marca, nombre);
		this.ramMB = 2048;
		agregarComponente(this.cpu);
	}

	public Microprocesador getCpu() {
		return cpu;
	}

	public void setCpu(Microprocesador cpu) {
		this.cpu = cpu;
		getComponentes().set(0, this.cpu);
	}

	public long getRamMB() {
		return ramMB;
	}

	public void setRamMB(long ramMB) {
		this.ramMB = ramMB;
	}

	@Override
	public String toString() {
		return "Computadora: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:" + getNumeroSerie()
				+ "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: " + getComponentes()
				+ "\nEncendido: " + isEncendido() + "\nRAM: " + getRamMB();
	}
}
