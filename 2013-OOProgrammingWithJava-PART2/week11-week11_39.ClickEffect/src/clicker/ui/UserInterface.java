package clicker.ui;
import clicker.applicationlogic.*;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
         GridLayout layout = new GridLayout(2, 1);
         container.setLayout(layout);
         
         JLabel calcValue = new JLabel("0");
         JButton calcButton = new JButton("click!");
         
         ClickListener listener = new ClickListener(calculator, calcValue);
         calcButton.addActionListener(listener);
         
         container.add(calcValue);
         container.add(calcButton);
         
   }

    public JFrame getFrame() {
        return frame;
    }
}
