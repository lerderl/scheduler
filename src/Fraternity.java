import java.util.Scanner;

public class Fraternity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the ABSU fraternity!");
    System.out.println("Kindly follow the prompts provided to secure your registration");
    System.out.print("Please enter your first name: ");
    String firstName = sc.nextLine();
    System.out.print("Please enter your surname: ");
    String surname = sc.nextLine();
    System.out.print("Please enter your age: ");
    int age = sc.nextInt();

    if (age >= 19) {
      System.out.print("Please enter your gender: ");
      char gender = sc.next().charAt(0);
      if (gender == 'M' || gender == 'm') {
        System.out.println("Welcome to the ABSU fraternity! " + firstName + " " + surname + "!");
      }
      else  if (gender == 'F' || gender == 'f') {
        System.out.println("Sorry, " + firstName + " " + surname + ". The ABSU fraternity is a Male only club");
      }
      else {
        System.out.println("Please enter the gender as 'M' or 'm' characters");
      } //end of gender check
    }
    else {
      System.out.println("Sorry, " + firstName + " " + surname + ". The eligible age to complete your registration is 19 and above!");
    } //end of age check
  }
}
