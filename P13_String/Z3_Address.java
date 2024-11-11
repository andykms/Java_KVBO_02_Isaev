import java.util.ArrayList;
import java.util.StringTokenizer;

public class Z3_Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Z3_Address(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",;", true);
        ArrayList<String> Info = new ArrayList<String>();
        while (tokenizer.hasMoreTokens()) {
            String part = tokenizer.nextToken();
            Info.add(part);
        }
        this.country = Info.get(0);
        this.region = Info.get(1);
        this.city = Info.get(2);
        this.street = Info.get(3);
        this.house = Info.get(4);
        this.building = Info.get(5);
        this.apartment = Info.get(6);
    }

    // Получение значений полей адреса
    public String getCountry() { return country; }
    public String getRegion() { return region; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getHouse() { return house; }
    public String getBuilding() { return building; }
    public String getApartment() { return apartment; }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}