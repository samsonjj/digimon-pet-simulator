package scene;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class DigiFrame extends JFrame
{
	private DigiPanel panel;

    public DigiFrame()
    {
        super();
        panel = new DigiPanel();
        panel.setPreferredSize(new Dimension(500,500));
        this.add(panel);

        this.setSize(1500, 1500);
        this.setTitle("Veridian Dynamics Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

	public static void main(String[] args)
	{
		DigiFrame frame = new DigiFrame();

		while(true){
			//lemon.repaint();
			frame.panel.repaint();

			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}





}
