import java.util.*;

public class Obolocka1{
  public static void main(String[] args){
    Double d1 = Double.valueOf("7.123");
    Double d2 = Double.valueOf(134.12);
    String num_str = "567.348";
    double num_dbl = Double.parseDouble(num_str);
    System.out.println(num_dbl);
    double d = 56.90234;
    int i = (int) d; // преобразует в тип int
    byte b = (byte) d; // преобразует в тип byte
    short s = (short) d; // преобразует в тип short
    long l = (long) d; // преобразует в тип long
    float f = (float) d; // преобразует в тип float
    //char c = (char) d; // не будет работать, так как невозможно преобразовать double в char
    //boolean b1 = false; // boolean нельзя преобразовать из double
    System.out.println("double: "+ d +" int: "+
    i +" byte: "+
    b +" short: "+
    s +" long: "+
    l +" float: "+
    f +" ");
    System.out.println("Объект Double: " + d1); 
    System.out.println("Объект Double: " + d2); 
    String double_str = Double.toString(3.14);
    System.out.println("Объект String: " +double_str);
    /*В Java метод toString(primitive, radix) используется для преобразования числового значения примитивного типа в строку.

Аргументы метода:

primitive — значение примитивного типа (например, int, long, double и т. д.), которое необходимо преобразовать в строку;
radix — основание системы счисления, в которой представлено значение primitive. Если этот аргумент не указан, по умолчанию используется десятичная система счисления.*/
  }
}