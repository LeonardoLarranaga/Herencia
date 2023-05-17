package UI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.imageio.ImageIO;

import Herencia.DispositivoElectronico;

public class UICanvas {
	
	private BufferedImage image;
	private DispositivoElectronico dispositivo;
	
	public UICanvas(String imagen, DispositivoElectronico dispositivo) {
		try {
			image = ImageIO.read(new File("src/UI/" + imagen));
		} catch (Exception error) {
			error.printStackTrace();
		}
		
		this.dispositivo = dispositivo;
	}
	
	public void dibujar() {
		JFrame frame = new JFrame("Herencia");
		frame.setLocationRelativeTo(null);
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel canvas = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				int x = (getWidth() - 300) / 2;
                int y = (getHeight() - 300) / 2;
                g.drawImage(image, x, y, 300, 300, null);
			}
		};
		
		canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();

                if (clickX >= 25 && clickX <= 325 && clickY >= 15 && clickY <= 325) {
                    System.out.println(dispositivo.toString());
                }
            }
        });
		
		frame.add(canvas);
        frame.setVisible(true);
	}
}
