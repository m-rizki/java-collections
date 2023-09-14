public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    Integer iniInteger = 10;
    Long iniLong = 10L;
    Boolean iniBoolean = true;

    Short iniShort; // null
    iniShort = 100;

    System.out.println(iniInteger);
    System.out.println(iniLong);
    System.out.println(iniBoolean);
    System.out.println(iniShort);

    int iniInt = 100;

    Integer iniInteger2 = iniInt;
    System.out.println(iniInteger2);

    // Konversi dari tipe primitif
    int age = 30;
    Integer ageObject = age;

    int ageAgain = ageObject;
    System.out.println(ageAgain);

    // konversi ke tipe data primitive tapi ke yg ga kompatible - shortValue(), byteValue(), dst
    short shortAge = ageObject.shortValue();
    byte byteAge = ageObject.byteValue();
    System.out.println(shortAge);
    System.out.println(byteAge);
  }
}
