import java.util.Arrays;

public class Z4_Shirt {
    private String id;
    private String type;
    private String color;
    private String size;

    public Z4_Shirt(String id, String type, String color, String size) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}