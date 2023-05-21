package UI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import Herencia.Microprocesador;

public class UIMicroprocesador extends JButton {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Microprocesador microprocesador;
	
	public UIMicroprocesador() {
		init("Microprocesador.png", Ejemplo.microprocesador);
	}

	public UIMicroprocesador(String imagen, Microprocesador microprocesador) {
		init(imagen, microprocesador);
	}

	public BufferedImage getImage() {
		return image;
	}

	public Microprocesador getMicroprocesador() {
		return microprocesador;
	}

	
	public void init(String imagen, Microprocesador microprocesador) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
			
			setIcon(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
			setPreferredSize(new Dimension(300, 300));
			
			addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(microprocesador.toString());
                }
            });
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.microprocesador = microprocesador;
	}
}