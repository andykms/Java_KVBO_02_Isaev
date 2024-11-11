import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;


public class Z5_Main {
  public static void main(String[] args) {
    Z5_PhoneNumberConverter converter = new Z5_PhoneNumberConverter("+79175655655");
    System.out.println(converter.convertPhoneNumber()); // +7-917-565-5655
    
    Z5_PhoneNumberConverter converter2 = new Z5_PhoneNumberConverter("89175655655");
    System.out.println(converter2.convertPhoneNumber()); // +7-917-565-5655
}
}