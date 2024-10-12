import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main5_1 {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            MatchResultSimulator simulator = new MatchResultSimulator();
            simulator.setVisible(true);
        }
    });
}
}