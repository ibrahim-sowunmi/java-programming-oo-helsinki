/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.*;
import java.awt.event.*;
import clicker.applicationlogic.*;
import javax.swing.*;

/**
 *
 * @author ibz
 */
public class ClickListener implements ActionListener{
    private Calculator calculator;
    private JLabel jlabel;
    
    public ClickListener(Calculator calculator, JLabel jlabel ) {
        this.calculator = calculator;
        this.jlabel = jlabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.jlabel.setText(calculator.giveValue() + "");
    }
    
}
