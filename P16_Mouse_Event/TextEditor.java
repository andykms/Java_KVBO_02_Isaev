import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        // Создание меню "Цвет"
        JMenu colorMenu = new JMenu("Цвет");
        String[] colors = {"Синий", "Красный", "Черный"};
        for (String color : colors) {
            JMenuItem menuItem = new JMenuItem(color);
            menuItem.addActionListener(new ColorAction(color));
            colorMenu.add(menuItem);
        }
        menuBar.add(colorMenu);

        // Создание меню "Шрифт"
        JMenu fontMenu = new JMenu("Шрифт");
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
        for (String font : fonts) {
            JMenuItem menuItem = new JMenuItem(font);
            menuItem.addActionListener(new FontAction(font));
            fontMenu.add(menuItem);
        }
        menuBar.add(fontMenu);

        setJMenuBar(menuBar);
    }

    private class ColorAction implements ActionListener {
        private String colorName;

        public ColorAction(String colorName) {
            this.colorName = colorName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color color;
            switch (colorName) {
                case "Синий":
                    color = Color.BLUE;
                    break;
                case "Красный":
                    color = Color.RED;
                    break;
                case "Черный":
                    color = Color.BLACK;
                    break;
                default:
                    color = Color.BLACK;
            }
            textArea.setForeground(color);
        }
    }

    private class FontAction implements ActionListener {
        private String fontName;

        public FontAction(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font font;
            switch (fontName) {
                case "Times New Roman":
                    font = new Font("Times New Roman", Font.PLAIN, 12);
                    break;
                case "MS Sans Serif":
                    font = new Font("MS Sans Serif", Font.PLAIN, 12);
                    break;
                case "Courier New":
                    font = new Font("Courier New", Font.PLAIN, 12);
                    break;
                default:
                    font = new Font("Arial", Font.PLAIN, 12);
            }
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor editor = new TextEditor();
            editor.setVisible(true);
        });
    }
}
/*
### Объяснение кода:

1. **Создание окна**: создаем класс `TextEditor`, который наследует `JFrame`. В конструкторе устанавливаем заголовок, размер и поведение при закрытии окна.

2. **Создание `JTextArea`**: создаем текстовую область `JTextArea` и добавляем ее в окно.

3. **Создание меню**: создаем `JMenuBar`, в который добавляем два меню: "Цвет" и "Шрифт". Каждое меню содержит несколько пунктов, каждый из которых имеет свой обработчик событий.

4. **Обработчики событий**: Классы `ColorAction` и `FontAction` реализуют интерфейс `ActionListener` и изменяют цвет текста и шрифт соответственно при выборе пункта меню.

5. **Запуск приложения**: В методе `main`  запускаем приложение в потоке обработки событий Swing.

*/