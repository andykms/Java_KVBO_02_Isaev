import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addNumberListener(new NumberListener());
        this.view.addOperatorListener(new OperatorListener());
        this.view.addEqualsListener(new EqualsListener());
        this.view.addClearListener(new ClearListener());
    }

    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            view.setDisplay(view.getDisplay() + command);
        }
    }

    class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            try {
                double operand = Double.parseDouble(view.getDisplay());
                model.setOperand(operand);
                model.setOperator(command);
                view.setDisplay("");
            } catch (NumberFormatException ex) {
                view.setDisplay("Error");
            }
        }
    }

    class EqualsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double result = model.calculate();
                view.setDisplay(String.valueOf(result));
            } catch (ArithmeticException ex) {
                view.setDisplay(ex.getMessage());
            }
        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.clear();
            view.setDisplay("");
        }
    }
}

