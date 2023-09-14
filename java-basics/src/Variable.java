public class Variable {
  public static void main(String[] args) {
    String name;
    name = "Muhamad Rizki";

    int age = 25;
    String address = "Indonesia";

    System.out.println(name);
    System.out.println(age);
    System.out.println(address);

    // by default its mutalbe variable
    name = "Lionel Messi";
    System.out.println(name);

    // name = 100; // Type mismatch: cannot convert from int to String

    // var keyword
    // var name; // Cannot use 'var' on variable without initializer
    var age2 = 25;
    var address2 = "Argentina";

    System.out.println(age2);
    System.out.println(address2);

    final var brand = "Adidas";

    // brand = "Puma"; // The final local variable brand cannot be assigned. It must be blank and not using a compound assignment
    System.out.println(brand);
  }
}
