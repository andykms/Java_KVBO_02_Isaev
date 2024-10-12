public class Main5{
  public enum Season {
    WINTER("Зима", 0),
    SPRING("Весна", 5),
    SUMMER("Лето", 20),
    FALL("Осень", 10);

    private String name;
    private int averageTemperature;

    Season(String name, int averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
      if (this == WINTER){
        return "Холодное время года";
      }
      else if (this == SUMMER){
        return "Теплое время года";
      }
      else {
        return "Межсезонное время года";
      }

  }  
  
}

void printDescription(Season season) {
    switch (season) {
        case WINTER:
            System.out.println("Я люблю зиму");
            break;
        case SPRING:
            System.out.println("Мне нравится весна");
            break;
        case SUMMER:
            System.out.println("Я люблю лето");
            break;
        case FALL:
            System.out.println("Осень — прекрасное время года");
            break;
    }
}
  public static void main(String[] args){
    Season myFavoriteSeason = Season.SUMMER; // Лето — моё любимое время года
    System.out.println("Моё любимое время года - " + myFavoriteSeason.getName());
    System.out.printf("Средняя температура в это время года составляет %d градусов Цельсия.\n", myFavoriteSeason.getAverageTemperature());

    // Переопределение метода getDescription для константы Лето
    myFavoriteSeason.getDescription();
    for (Season season : Season.values()) {
      System.out.printf("%s: средняя температура %d градусов Цельсия, описание - %s\n",
              season.getName(), season.getAverageTemperature(), season.getDescription());
  }
  };

}