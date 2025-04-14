import java.util.Scanner;

public class AverageOfThree {
  public static void main(String[] args) {
    Scanner average = new Scanner(System.in);
    double numberOne, numberTwo, numberThree;
    double sum;
    double averageOfThree;

    System.out.print("Enter the first number: ");
    numberOne = average.nextDouble();
    System.out.print("Enter the second number: ");
    numberTwo = average.nextDouble();
    System.out.print("Enter the third number: ");
    numberThree = average.nextDouble();

    sum = numberOne + numberTwo + numberThree;
    averageOfThree = sum / 3;
    System.out.println("The average of the three numbers is: " + averageOfThree);
  }
}
