public interface ComplexAbstractFactory {
    Complex createComplex(); // Метод для создания комплексного числа без параметров
    Complex createComplex(int real, int image); // Метод для создания комплексного числа с параметрами
}
