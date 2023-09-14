public class Array {
  public static void main(String[] args) {

    // Array - intro
    String[] stringArray;
    stringArray = new String[3];

    stringArray[0] = "Muhamad";
    stringArray[1] = "Rizki";
    stringArray[2] = "S. Kom";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    stringArray[2] = "S. Kom.";
    System.out.println(stringArray[2]);

    // String[] stringArray2 = new String[3];

    int[] arrayInt = new int[] {
        10, 20, 30, 40
    };

    long[] arrayLong = {
        20L, 40L, 60L, 80L
    };

    System.out.println(arrayInt[3]);
    System.out.println(arrayLong.length);

    String[][] members = {
        { "Muhamad", "Rizki" },
        { "Lionel", "Andres", "Messi" },
        { "Erling", "Haaland" }
    };

    String[] member1 = members[0];
    System.out.println(member1);

    System.out.println(members[0][0]);
    System.out.println(members[1][2]);
  }
}
