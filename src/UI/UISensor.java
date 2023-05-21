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

import Herencia.Sensor;

public class UISensor extends JButton {
	
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	private Sensor sensor;
	
	public UISensor() {
		init("Sensor.png", Ejemplo.sensor);
	}

	public UISensor(String imagen, Sensor sensor) {
		init(imagen, sensor);
	}

	public BufferedImage getImage() {
		return image;
	}

	public Sensor getSensor() {
		return sensor;
	}

	
	public void init(String imagen, Sensor sensor) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
			
			setIcon(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
			setPreferredSize(new Dimension(300, 300));
			
			addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(sensor.toString());
                }
            });
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.sensor = sensor;
	}
}
