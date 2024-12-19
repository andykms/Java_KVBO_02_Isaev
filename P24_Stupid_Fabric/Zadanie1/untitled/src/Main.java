//ЗАДАНИЕ 2 - РАЗЛИЧНЫЕ ТИПЫ СТУЛЬЕВ

public class Main {
    public static void main(String[] args) {
        ChairFactory victorianFactory = new VictorianChairFactory();
        Client client1 = new Client(victorianFactory);
        client1.sit(); // Вывод: Сидите на викторианском стуле.

        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        Client client2 = new Client(multifunctionalFactory);
        client2.sit(); // Вывод: Сидите на многофункциональном стуле.

        ChairFactory magicalFactory = new MagicalChairFactory();
        Client client3 = new Client(magicalFactory);
        client3.sit(); // Вывод: Сидите на магическом стуле.
    }
}
