import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Main5_2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите путь к файлу: ");
    String len = sc.nextLine();
    // Проверка наличия аргументов командной строки

    String imagePath = len;
    // Проверка существования файла
    File imgFile = new File(imagePath);
    if (!imgFile.exists()) {
        System.out.println("Файл не найден: " + imagePath);
        return;
    }

    // Создание и отображение окна с изображением
    ImageDisplay imageDisplay = new ImageDisplay(imagePath);
    imageDisplay.setVisible(true);
  }
}