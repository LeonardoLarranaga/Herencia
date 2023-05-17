package Herencia;
import java.util.ArrayList;

public class DispositivoElectronico {
	private final String fabricante;
	private final String numeroSerie;
	private final String marca;
	private final String nombre;
	private double costo;
	private ArrayList<ComponenteElectronico> componentes;

	public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
		this.fabricante = fabricante;
		this.numeroSerie = numeroSerie;
		this.marca = marca;
		this.nombre = nombre;
		this.costo = 0;
		this.componentes = new ArrayList<ComponenteElectronico>();
	}

	public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes) {
		this.fabricante = fabricante;
		this.numeroSerie = numeroSerie;
		this.marca = marca;
		this.nombre = nombre;
		this.costo = costo;
		this.componentes = componentes;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public ArrayList<ComponenteElectronico> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<ComponenteElectronico> componentes) {
		this.componentes = componentes;
	}

	public void agregarComponente(ComponenteElectronico componente) {
		this.componentes.add(componente);
	}

	public void quitarComponente(ComponenteElectronico componente) {
		this.componentes.remove(componente);
	}

	@Override
	public String toString() {
		return "Dispositivo electrónico: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:"
				+ getNumeroSerie() + "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: "
				+ getComponentes();
	}
}