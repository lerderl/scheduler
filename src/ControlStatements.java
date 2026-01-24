import java.util.Scanner;

public class ControlStatements {
  public static void main(String[] args) {
//    Sequential(Sequence)
    int age = 18;

//    Selection(Decision)
    if (age < 16) {
      System.out.println("You cannot drive yet!");
    }
    else {
      System.out.println("You can drive!");
    } //end if-else

    System.out.println(); //add some newline space

//    Repetition(Loops)
    for (int i = 0; i <= age; i++) {
      System.out.println("happy Birthday!!! You are " + i + " years old!");
    }

    System.out.println();

//    Selection Control Statements are: if, if-else, switch
    System.out.println("---------SELECTION FUN!!!---------");
    int customerAge;
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Pub and Grille.");
    System.out.println("Please, enter your age");
    customerAge = input.nextInt();
    if (customerAge >= 21) {
      System.out.println("Here, have a beer.");
    }
    else if (customerAge >= 16) {
      System.out.println("Here, have a soda!");
      System.out.println("At least you can drive!");
    }
    else {
      System.out.println("Here, have a soda!");
    }
    System.out.println("Thanks for coming to the Pub and Grille!");

    System.out.println();

//    Grade fun
    System.out.println("---------GRADE FUN!!!---------");
    char grade;
    System.out.println("Enter a grade");
    grade = input.next().charAt(0);

//    Switch statement
    switch (grade) {
      case 'A':
      case 'a':
        System.out.println("Excellent!");
        break;
      case 'B':
      case 'b':
        System.out.println("Very good!");
        break;
      case 'C':
      case 'c':
        System.out.println("Good!");
        break;
      case 'D':
      case 'd':
        System.out.println("Pass!");
        break;
      case 'F':
      case 'f':
        System.out.println("Fail!");
        break;
      default:
          System.out.println("Invalid grade!");
    } //end switch
  } //end main
}
