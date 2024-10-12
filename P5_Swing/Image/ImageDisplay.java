import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageDisplay extends JFrame {
    private Image image;

    public ImageDisplay(String imagePath) {
        // Установка заголовка окна
        setTitle("Image Display");

        // Загрузка изображения
        image = Toolkit.getDefaultToolkit().getImage(imagePath);

        // Установка поведения при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Размер окна

        // Центрирование окна на экране
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Отображение изображения
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        } else {
            g.drawString("Изображение пустое", 20, 20);
        }
    }
  }