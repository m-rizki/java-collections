public class KonversiNumber {
  public static void main(String[] args) {
    
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;

    // byte iniByte2 = iniInt; // Type mismatch: cannot convert from int to byte
    byte iniByte2 = (byte) iniInt;

    // number overflow, ketika sampe batesnya (byte 127) dia bakal balik lagi ke belakang (-128)
    int iniInt2 = 1000;
    byte iniByte3 = (byte) iniInt2;

    System.out.println(iniByte2);
    System.out.println(iniByte3);
  }
}
