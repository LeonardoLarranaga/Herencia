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

import Herencia.Pantalla;

public class UIPantalla extends JButton {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Pantalla pantalla;
	
	public UIPantalla() {
		init("Pantalla.png", Ejemplo.pantalla);
	}

	public UIPantalla(String imagen, Pantalla pantalla) {
		init(imagen, pantalla);
	}

	public BufferedImage getImage() {
		return image;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	
	public void init(String imagen, Pantalla pantalla) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
			
			setIcon(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
			setPreferredSize(new Dimension(300, 300));
			
			addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(pantalla.toString());
                }
            });
			
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.pantalla = pantalla;
	}
}
