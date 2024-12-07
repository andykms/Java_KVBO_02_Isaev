public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0); // Создание комплексного числа (0 + 0i)
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image); // Создание комплексного числа с заданными частями
    }
}

