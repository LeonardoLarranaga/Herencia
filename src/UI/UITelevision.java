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

import Herencia.Television;

public class UITelevision extends JButton {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Television television;
	
	public UITelevision() {
		init("Television.png", Ejemplo.television);
	}

	public UITelevision(String imagen, Television television) {
		init(imagen, television);
	}

	public BufferedImage getImage() {
		return image;
	}

	public Television getTelevision() {
		return television;
	}

	
	public void init(String imagen, Television television) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
			
			setIcon(new ImageIcon(image.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
			setPreferredSize(new Dimension(200, 200));
			
			addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(television.toString());
                }
            });
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.television = television;
	}
}
