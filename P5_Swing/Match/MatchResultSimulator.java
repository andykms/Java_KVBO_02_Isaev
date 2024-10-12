import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultSimulator extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public MatchResultSimulator() {
        setTitle("Match Result Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Создаем панели
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Кнопка для AC Milan
        JButton acMilanButton = new JButton("AC Milan");
        acMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResult("AC Milan");
            }
        });

        // Кнопка для Real Madrid
        JButton realMadridButton = new JButton("Real Madrid");
        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResult("Real Madrid");
            }
        });

        // Надписи для результатов
        resultLabel = new JLabel("Результат: 0 X 0");
        lastScorerLabel = new JLabel("Добавленные очки команде: N/A");
        winnerLabel = new JLabel("Победитель: DRAW");

        // Добавляем компоненты на панель
        panel.add(acMilanButton);
        panel.add(realMadridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        // Добавляем панель к фрейму
        add(panel);
    }

    private void updateResult(String lastScorer) {
        resultLabel.setText("Результат: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Добавленные очки команде: " + lastScorer);
        updateWinner();
    }

    private void updateWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Победитель: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Победитель: Real Madrid");
        } else {
            winnerLabel.setText("Победитель: DRAW");
        }
    }

}
