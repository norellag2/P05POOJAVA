package meteo;

public class FarToCel {
   static String messageCelsius = " Tº en celsius: ";
   static  String messageFarenheit = "Tº en farenheit: ";

   public static String getCelsius (int farenheit) {
      return messageCelsius + (farenheit - 32 ) * 5/9;
   }
   public static String getFarenheit(int celsius) {
    return messageFarenheit + (((9 * celsius) / 5) + 32);
}
}
