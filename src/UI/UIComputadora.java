package UI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

import Herencia.Computadora;

public class UIComputadora extends JButton {

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Computadora computadora;
	
	public UIComputadora() {
		init("Computadora.png", Ejemplo.computadora);
	}

	public UIComputadora(String imagen, Computadora computadora) {
		init(imagen, computadora);
	}

	public BufferedImage getImage() {
		return image;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	
	public void init(String imagen, Computadora computadora) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
			
			setIcon(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
			setPreferredSize(new Dimension(300, 300));
			
			addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(computadora.toString());
                }
            });
			
			
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.computadora = computadora;
	}
}
