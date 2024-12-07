import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons;
    private JButton addButton, subButton, mulButton, divButton, equalsButton, clearButton;

    public CalculatorView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        buttonPanel.add(clearButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public String getDisplay() {
        return display.getText();
    }

    public void setDisplay(String value) {
        display.setText(value);
    }

    public void addNumberListener(ActionListener listener) {
        for (JButton button : numberButtons) {
            button.addActionListener(listener);
        }
    }

    public void addOperatorListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subButton.addActionListener(listener);
        mulButton.addActionListener(listener);
        divButton.addActionListener(listener);
    }

    public void addEqualsListener(ActionListener listener) {
        equalsButton.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        clearButton.addActionListener(listener);
    }
}
