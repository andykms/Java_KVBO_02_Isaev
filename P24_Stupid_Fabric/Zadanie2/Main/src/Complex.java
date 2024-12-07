public class Complex {
    private int real; // Действительная часть
    private int image; // Мнимая часть

    // Конструктор
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    // Метод для получения действительной части
    public int getReal() {
        return real;
    }

    // Метод для получения мнимой части
    public int getImage() {
        return image;
    }

    // Метод для отображения комплексного числа в виде строки
    @Override
    public String toString() {
        return real + (image >= 0 ? " + " : " - ") + Math.abs(image) + "i";
    }
}

