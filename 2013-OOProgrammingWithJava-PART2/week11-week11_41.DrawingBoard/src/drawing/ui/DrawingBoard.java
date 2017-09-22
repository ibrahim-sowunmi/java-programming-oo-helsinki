package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 30, 60, 60);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(240, 30, 60, 60);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(50, 230, 60, 60);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(290, 230, 60, 60);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(110, 280, 190 , 60);

    }
}
