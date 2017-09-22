
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibz
 */
public class CalculatorListener implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton buttonOperation;
    private CalculatorLogic calculatorLogic;
    
    public CalculatorListener(JTextField input, JTextField output, JButton buttonOperation, CalculatorLogic calc) {
        this.input = input;
        this.output = output;
        this.buttonOperation = buttonOperation;
        this.calculatorLogic = calc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        calculatorLogic.setValue(Integer.parseInt(input.getText()));
        calculatorLogic.setOperation(buttonOperation.getText());
        calculatorLogic.calculate();
        this.output.setText(calculatorLogic.getStore());
        this.input.setText("0");
        
    }
    
}
