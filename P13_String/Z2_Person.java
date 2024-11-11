import java.util.Objects;

public class Z2_Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Конструктор без параметров
    public Person() {
        // Значения по умолчанию
        firstName = "";
        middleName = "";
        lastName = "";
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder();
        if (firstName.isEmpty()) {
            fullNameBuilder.append(lastName);
        } else if (middleName.isEmpty() && !firstName.isEmpty()) {
            fullNameBuilder.append(" ").append(firstName).append(" ").append(lastName);
        } else {
            if (!firstName.isEmpty()) {
                fullNameBuilder.append(" ");
                fullNameBuilder.append(firstName);
            }
            if (!middleName.isEmpty()) {
                fullNameBuilder.append(" ");
                fullNameBuilder.append(middleName);
            }
        }
        return fullNameBuilder.toString();
    }
}