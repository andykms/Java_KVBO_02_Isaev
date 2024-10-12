public class Main6_2 {
  public static void main(String[] args) {
      double celsiusTemperature = 25.0; // Пример температуры в Цельсиях

      // Конвертация в Кельвины
      Convertable toKelvin = new CelsiusToKelvin();
      double kelvinTemperature = toKelvin.convert(celsiusTemperature);
      System.out.println(celsiusTemperature + " °C = " + kelvinTemperature + " K");

      // Конвертация в Фаренгейты
      Convertable toFahrenheit = new CelsiusToFahrenheit();
      double fahrenheitTemperature = toFahrenheit.convert(celsiusTemperature);
      System.out.println(celsiusTemperature + " °C = " + fahrenheitTemperature + " °F");
  }
}