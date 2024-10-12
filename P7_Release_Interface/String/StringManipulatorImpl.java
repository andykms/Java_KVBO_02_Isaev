public class StringManipulatorImpl implements StringManipulator {

  @Override
  public int countCharacters(String s) {
      if (s == null) {
          return 0;
      }
      return s.length();
  }

  @Override
  public String getOddPositionChars(String s) {
      if (s == null) {
          return "";
      }
      
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
          // Позиции считаются с 0, поэтому берем i % 2 != 0 (то есть 1, 3, 5...)
          if (i % 2 == 0) { 
              result.append(s.charAt(i));
          }
      }
      return result.toString();
  }

  @Override
  public String reverseString(String s) {
      if (s == null) {
          return null;
      }
      
      return new StringBuilder(s).reverse().toString();
  }
}