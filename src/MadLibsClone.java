import java.util.Scanner;

public class MadLibsClone {
  public static void main(String[] args) {
    Scanner madLibsClone = new Scanner(System.in);
    String firstAdjective, girlName, secondAdjective, thirdAdjective, occupationOne, occupationTwo, place, clothing,
        hobby, boyName, kingName;

    System.out.print("Enter name of girl: ");
    girlName = madLibsClone.nextLine();
    System.out.print("Enter name of boy: ");
    boyName = madLibsClone.nextLine();
    System.out.print("Enter the adjective to describe girl looks: ");
    firstAdjective = madLibsClone.nextLine();
    System.out.print("Enter girl occupation: ");
    occupationOne = madLibsClone.nextLine();
    System.out.print("Enter boy occupation: ");
    occupationTwo = madLibsClone.nextLine();
    System.out.print("Enter the adjective to describe girl occupation: ");
    secondAdjective = madLibsClone.nextLine();
    System.out.print("Enter the adjective to describe boy occupation: ");
    thirdAdjective = madLibsClone.nextLine();
    System.out.print("Enter name of kingdom: ");
    place = madLibsClone.nextLine();
    System.out.print("Enter name of girl favourite clothing: ");
    clothing = madLibsClone.nextLine();
    System.out.print("Enter girl favourite hobby in present tense: ");
    hobby = madLibsClone.nextLine();
    System.out.print("Enter the king's name: ");
    kingName = madLibsClone.nextLine();

    System.out.println("There once was a " + firstAdjective + " girl named " + girlName + ", who was a " +
        secondAdjective + " " + occupationOne + " in the kingdom of " + place + ".");
    System.out.println("She loved to wear " + clothing + " and to " + hobby + ".");
    System.out.println("She wanted to marry the " + thirdAdjective + " " + occupationTwo + " named " + boyName + " " +
        "but her father, King " + kingName + " forbid her from seeing him.");
  }
}
