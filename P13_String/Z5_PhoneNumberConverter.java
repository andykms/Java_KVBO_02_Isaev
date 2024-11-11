import java.util.Objects;

public class Z5_PhoneNumberConverter {
    private String phoneNumber;

    public Z5_PhoneNumberConverter(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String convertPhoneNumber() {
        StringBuilder formattedNumber = new StringBuilder();
        
        // Check if the phone number starts with '+' or '8'
        if (phoneNumber.startsWith("+")) {
            formattedNumber.append(phoneNumber.substring(0, 2)); // Country code
            formattedNumber.append(phoneNumber.substring(2, 5)); // First three digits
            formattedNumber.append("-" + phoneNumber.substring(5, 8)); // Next three digits
            formattedNumber.append("-" + phoneNumber.substring(8)); // Last four digits
        } else if (phoneNumber.startsWith("8")) {
            formattedNumber.append("+7"); // Country code for Russia
            formattedNumber.append(phoneNumber.substring(1, 4)); // First three digits
            formattedNumber.append("-" + phoneNumber.substring(4, 7)); // Next three digits
            formattedNumber.append("-" + phoneNumber.substring(7)); // Last four digits
        } else {
            return "Invalid phone number format";
        }
        
        return formattedNumber.toString();
    }
}