import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    String city;
    int age;
    double money;

    System.out.println("Enter your name: ");
    name = sc.nextLine();
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    sc.nextLine();  //  Consume the new line
    System.out.print("Double your money by entering how much you currently have: $");
    money = sc.nextDouble();
    money *= 2;
    sc.nextLine();
    System.out.println("Enter your city: ");
    city = sc.nextLine();

    System.out.println("Hello, " + name + "!");
    System.out.println("You are " + age + " years old.");
    System.out.println("You live in " + city + " city.");
    System.out.println("Your money is now $" + money);
  }
}
