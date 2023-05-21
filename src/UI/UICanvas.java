package UI;

import java.awt.*;
import javax.swing.*;

public class UICanvas extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public UICanvas() {
		setTitle("Componentes electrónicos");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 3));
		
		UIComputadora computadora = new UIComputadora();
		UIMicroprocesador microprocesador = new UIMicroprocesador();
		UIPantalla pantalla = new UIPantalla();
		UISensor sensor = new UISensor();
		UISmartphone smartphone = new UISmartphone();
		UITelevision television = new UITelevision();
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.add(computadora);
		panelSuperior.add(microprocesador);
		panelSuperior.add(pantalla);
		
		JPanel panelInferior = new JPanel();
		panelInferior.add(sensor);
		panelInferior.add(smartphone);
		panelInferior.add(television);
		
		add(panelSuperior);
		add(panelInferior);
		
		pack();
		setVisible(true);
		
	}
	
	public static void main(String [] args) {
		new UICanvas();
	}
}
