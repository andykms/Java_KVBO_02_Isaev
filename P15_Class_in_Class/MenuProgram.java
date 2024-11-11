import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;


public class MenuProgram extends JFrame {
private JTextArea textArea;

public MenuProgram() {
    setTitle("Программа с меню");

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu fileMenu = new JMenu("Файл");
    JMenu editMenu = new JMenu("Правка");
    JMenu helpMenu = new JMenu("Справка");

    JMenuItem saveItem = new JMenuItem("Сохранить");
    JMenuItem exitItem = new JMenuItem("Выйти");

    JMenuItem copyItem = new JMenuItem("Копировать");
    JMenuItem cutItem = new JMenuItem("Вырезать");
    JMenuItem pasteItem = new JMenuItem("Вставить");

    JMenuItem aboutItem = new JMenuItem("О программе");

    saveItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = textArea.getText();
            // Добавить код для сохранения текста в файле
        }
    });

    exitItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

    copyItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.copy();
        }
    });

    cutItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.cut();
        }
    });

    pasteItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.paste();
        }
    });

    aboutItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(MenuProgram.this, "Программа с меню", "О программе", JOptionPane.INFORMATION_MESSAGE);
        }
    });

    fileMenu.add(saveItem);
    fileMenu.addSeparator();
    fileMenu.add(exitItem);

    editMenu.add(copyItem);
    editMenu.add(cutItem);
    editMenu.add(pasteItem);

    helpMenu.add(aboutItem);

    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);

    textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);

    getContentPane().add(scrollPane, BorderLayout.CENTER);

    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}

    public static void main(String[] args) {
        new MenuProgram();
    }
}