import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PasswordChecker() {
        setTitle("Password Checker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Используем GridBagLayout для компоновки элементов
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Создаем элементы интерфейса
        JLabel usernameLabel = new JLabel("Имя пользователя:");
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JPasswordField(15);
        checkButton = new JButton("Проверить");
        resultLabel = new JLabel("");

        // Настройка GridBagConstraints для размещения компонентов
        gbc.insets = new Insets(5, 5, 5, 5); // Отступы между элементами

        // Добавляем элементы в окно
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(usernameLabel, gbc);

        gbc.gridx = 1;
        add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        gbc.gridx = 1;
        add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Занять две колонки
        add(checkButton, gbc);

        gbc.gridy = 3;
        add(resultLabel, gbc);

        // Добавляем обработчик нажатия на кнопку
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPassword();
            }
        });
    }

    private void checkPassword() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Пример проверки пароля
        if ("admin".equals(username) && "1234".equals(password)) {
            resultLabel.setText("Пароль верный!");
            resultLabel.setForeground(Color.GREEN);
        } else {
            resultLabel.setText("Пароль неверный!");
            resultLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordChecker checker = new PasswordChecker();
            checker.setVisible(true);
        });
    }
}
/*

1. **Создание окна**: Класс `PasswordChecker` наследует `JFrame`. В конструкторе устанавливаем заголовок, размер и поведение при закрытии окна.

2. **Менеджер компоновки**: Используется `GridBagLayout`, который позволяет гибко размещать компоненты в сетке. Создаем объект `GridBagConstraints` для управления расположением каждого элемента.

3. **Создание элементов интерфейса**: Создаются текстовые поля для имени пользователя и пароля, кнопка для проверки и метка для отображения результата.

4. **Добавление элементов**: Каждый элемент добавляется в окно с использованием настроек `GridBagConstraints`.

5. **Обработчик событий**: При нажатии на кнопку "Проверить" вызывается метод `checkPassword()`, который проверяет введенные данные и обновляет метку с результатом.

6. **Запуск приложения**: В методе `main` приложение запускается в потоке обработки событий Swing.
*/