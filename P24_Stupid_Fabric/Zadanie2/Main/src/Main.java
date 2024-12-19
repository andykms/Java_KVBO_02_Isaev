//ЗАДАНИЕ 1 -  UML диаграмма

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создаем комплексное число без параметров
        Complex complex1 = factory.createComplex();
        System.out.println("Комплексное число 1: " + complex1); // Вывод: 0 + 0i

        // Создаем комплексное число с параметрами
        Complex complex2 = factory.createComplex(3, 4);
        System.out.println("Комплексное число 2: " + complex2); // Вывод: 3 + 4i

        // Создаем комплексное число с другими параметрами
        Complex complex3 = factory.createComplex(5, -2);
        System.out.println("Комплексное число 3: " + complex3); // Вывод: 5 - 2i
    }
}
