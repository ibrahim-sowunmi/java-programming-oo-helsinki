package survey;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox yesBox = new JCheckBox("Yes!");
        JCheckBox noBox = new JCheckBox("No!");
        
        container.add(yesBox);
        container.add(noBox);
        
        ButtonGroup buttonGroup2 = new ButtonGroup();
        
        buttonGroup2.add(yesBox);
        buttonGroup2.add(noBox);
        container.add(yesBox);
        container.add(noBox);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton radioButton1 = new JRadioButton("No reason.");
        JRadioButton radioButton2 = new JRadioButton("Because it is fun!");
        
        ButtonGroup buttonGroup1 = new ButtonGroup();
        
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        container.add(radioButton1);
        container.add(radioButton2);
        
        container.add(new JButton("Done!"));
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
