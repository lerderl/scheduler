public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Hello Joseph");

//    Variables, Constants and Data Types ( Data in Java )
    int age = 19;
    final int SOME_NUMBER = 20; // Symbolic constant
    String name = "Joseph";
    String hometown = "Lekki";
    System.out.println(name + " is " + age + " years old");
    System.out.print(name + " is " + age + " years old\n");
    System.out.println("My hometown is " + hometown);
    System.out.print("Constant is " + SOME_NUMBER);

//    Primitive versus Reference Types
    double myDouble = 3.14;
    float myFloat = 3.14f; // narrowing/lossy conversion
    double yourDouble = myFloat; // widening/lossless conversion
  }
}
