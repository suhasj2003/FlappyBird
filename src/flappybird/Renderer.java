package flappybird;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("all")
public class Renderer extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		FlappyBird.flappyBird.repaint(g);
	}
	
	
}
