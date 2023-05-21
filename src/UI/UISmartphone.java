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

import Herencia.Smartphone;

public class UISmartphone extends JButton {	
	
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Smartphone smartphone;
	
	public UISmartphone() {
		init("Smartphone.png", Ejemplo.smartphone);
	}

	public UISmartphone(String imagen, Smartphone smartphone) {
		init(imagen, smartphone);
	}

	public BufferedImage getImage() {
		return image;
	}

	public Smartphone getSmartphone() {
		return smartphone;
	}

	
	public void init(String imagen, Smartphone smartphone) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
			
			setIcon(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
			setPreferredSize(new Dimension(300, 300));
			
			addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(smartphone.toString());
                }
            });
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.smartphone = smartphone;
	}
}
