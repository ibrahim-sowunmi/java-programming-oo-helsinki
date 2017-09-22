
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(800, 600));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField calculatorOutput = new JTextField("0");
        calculatorOutput.setEnabled(false);
        
        JTextField calculatorInput = new JTextField("");
        
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton zButton = new JButton("Z");
        
        CalculatorLogic logic = new CalculatorLogic();
        
        plusButton.addActionListener(new CalculatorListener(calculatorInput, calculatorOutput, plusButton, logic));
        minusButton.addActionListener(new CalculatorListener(calculatorInput, calculatorOutput, minusButton, logic));
        zButton.addActionListener(new CalculatorListener(calculatorInput, calculatorOutput, zButton, logic));
        
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(zButton);
        
        container.add(calculatorOutput);
        container.add(calculatorInput);
        container.add(panel);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}