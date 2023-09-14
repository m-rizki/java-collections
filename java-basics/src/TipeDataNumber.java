public class TipeDataNumber {
  public static void main(String[] args) {
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 10000000;
    long iniLong = 1000000000;
    long iniLong2 = 1000000000L; // bisa ditambahkan suffix L untuk menandakan klo long

    System.out.println(iniByte);
    System.out.println(iniShort);
    System.out.println(iniInt);
    System.out.println(iniLong);
    System.out.println(iniLong2);

    float iniFloat = 10.10F; // suffix F
    double iniDouble = 10.12;

    System.out.println(iniFloat);
    System.out.println(iniDouble);

    int decimalInt = 25;
    int hexInt = 0xA132B;
    int binInt = 0b01001;

    System.out.println(decimalInt);
    System.out.println(hexInt);
    System.out.println(binInt);

    long balance = 1_000_000_000;
    int sum = 60_000_000;
    
    System.out.println(balance);
    System.out.println(sum);
  }
}
