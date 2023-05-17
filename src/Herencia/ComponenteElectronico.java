package Herencia;
import java.util.ArrayList;

public class ComponenteElectronico extends DispositivoElectronico {

	private DispositivoElectronico esParteDe;

	public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, double costo,
			ArrayList<ComponenteElectronico> componentes) {
		super(fabricante, numeroSerie, marca, nombre, costo, componentes);
	}

	public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
		super(fabricante, numeroSerie, marca, nombre);
	}

	public DispositivoElectronico getEsParteDe() {
		return esParteDe;
	}

	public void setEsParteDe(DispositivoElectronico esParteDe) {
		this.esParteDe = esParteDe;
	}

	@Override
	public String toString() {
		return "Componente electrónico: \n\n" + "\nFabricante: " + getFabricante() + "\nNúmero de serie:"
				+ getNumeroSerie() + "\nMarca: " + getMarca() + "\nCosto: $" + getCosto() + "\nComponentes: "
				+ getComponentes() + "\nEs parte de: " + getEsParteDe();
	}
}
