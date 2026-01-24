public class Operators {
  public static void main(String[] args) {
//    Arithmetic operators
    int a = 10;
    int b = 20;

//    Examples of binary operators
    int result = a + b; // addition
    int difference = a - b; // subtraction
    int product = a * b;  // multiplication
    int quotient = b / a; //  division
    int remainder = a % b;  //  modulus

    System.out.println("Result is " + result);
    System.out.println("Difference is " + difference);
    System.out.println("Product is " + product);
    System.out.println("Quotient is " + quotient);
    System.out.println("Remainder is " + remainder);

//    Compound assignment operators
    result += 20; //  result = result + 20
    System.out.println("Result is now " + result);

//    Examples of unary operators
    result++;
    System.out.println("Result++ " + result);
    result--;
    System.out.println("Result-- " + result);

//    Challenge
    product *= 10;
    System.out.println("Product is now " + product);


//    RELATIONAL OPERATORS
    boolean myBool = true;
    boolean myBool2 = false;
    int myAge = 37;
    int yourAge = 18;
    int bobAge = 27;

    System.out.println("myBool is " + myBool);
    System.out.println("myBool2 is " + myBool2);

    boolean ageCompare = myAge > bobAge;
    System.out.println("Is my age > bob's age?: " + ageCompare);

    ageCompare = yourAge < bobAge;
    System.out.println("Is your age < bob's age?: " + ageCompare);

    ageCompare = yourAge == bobAge;
    System.out.println("Is your age == bob's age?: " + ageCompare);

    String myString = "Hello";
    String myString2 = "Hello";

    boolean nameCompare = myString.equals(myString2);
    System.out.println("Is myString == myString2?: " + nameCompare);

//    Challenge
    int currentAge = 19;
    boolean isMyCurrentAgeGreaterThanOrEqualTo21 = currentAge >= 21;
    System.out.println("Is myCurrentAge >= 21?: " + isMyCurrentAgeGreaterThanOrEqualTo21);


//    LOGICAL OPERATORS
    boolean isRaining = true;
    boolean isWindy = true;

    boolean combined = isRaining && isWindy;
    System.out.println("Is it raining and windy?: " + combined);

    combined = isRaining || isWindy;
    System.out.println("Is it raining or windy?: " + combined);

    combined = !isRaining;
    System.out.println("Is it NOT raining?: " + combined);
  }
}
