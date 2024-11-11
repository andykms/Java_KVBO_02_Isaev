import java.util.Random;

class Z3_Test_Address {
    public static void main(String[] args) {
        // Создание тестовых адресов
        Z3_Address address1 = new Z3_Address("Россия, Московская область, Москва, ул. Пушкина, д. 10, корп. 2, кв. 3");
        Z3_Address address2 = new Z3_Address("Германия, Бавария, Мюнхен, Шванштрассе, д. 4, кв. 5");
        Z3_Address address3 = new Z3_Address("Франция, Иль-де-Франс, Париж, авеню де ла Гранд Арме, д. 7, корп. 9, кв. 11");
        Z3_Address address4 = new Z3_Address("США, Калифорния, Сан-Франциско, Маркет Стрит, д. 20");

        System.out.println("Адрес 1: " + address1.toString());
        System.out.println("Адрес 2: " + address2.toString());
        System.out.println("Адрес 3: " + address3.toString());
        System.out.println("Адрес 4: " + address4.toString());
    }
}
