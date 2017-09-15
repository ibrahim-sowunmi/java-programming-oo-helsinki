/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ibz
 */
public class ActionEventListener implements ActionListener {
    
    private JTextField textField;
    private JLabel labelArea;
    
    public ActionEventListener(JTextField textField, JLabel labelArea) {
        this.textField = textField;
        this.labelArea = labelArea;      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.labelArea.setText(this.textField.getText());
        this.textField.setText("");
        
    }
    
}
