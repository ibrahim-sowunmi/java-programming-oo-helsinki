

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new GraphicCalculator());
        
        CalculatorLogic calc = new CalculatorLogic();
        calc.setValue(5);
        calc.setOperation("+");
        
        calc.calculate();
        calc.setValue(5);
        calc.calculate();
        System.out.println(calc.getStore());
    }
}
