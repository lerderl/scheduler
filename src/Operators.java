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
  }
}
