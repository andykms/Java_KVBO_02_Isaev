class CelsiusToKelvin implements Convertable {
  @Override
  public double convert(double celsius) {
      return celsius + 273.15;
  }
}