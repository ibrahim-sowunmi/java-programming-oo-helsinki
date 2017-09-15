package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        
        JTextField topTextArea = new JTextField();
        JButton midButton = new JButton("Copy!");
        JLabel bottomLabel = new JLabel();
        
        ActionEventListener textJump = new ActionEventListener(topTextArea, bottomLabel);
        midButton.addActionListener(textJump);
        
        container.add(topTextArea);
        container.add(midButton);
        container.add(bottomLabel);
        
        
        
        
    }
}
