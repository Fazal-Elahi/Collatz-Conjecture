/*
  * Author: Fazal Elahi
  * Program to use to calculate Collatz Conjecture.
  * Student ID: XXX
*/

 public class Collatz{

  public int next(int nextNumber){
    // Evaluate Number
    if (nextNumber == 1) {
      return 0;
    } else if (nextNumber%2 == 0) {
      // Debug (Even Number Detected)
      // System.out.println("Even: " + number);
      nextNumber = nextNumber/2;
    } else {
      // Debug (Odd Number Detected)
      // System.out.println("Odd: " + nextNumber);
      nextNumber = (nextNumber*3)+1;
    }
    return nextNumber;
  }

  public int stoppingTime(int stopCheck){
    int steps;
    // Steps is set to 1, to account for 0
    for (steps = 0;stopCheck != 1;steps++) {
      // Debug - Checking Numbers System.out.println("NextNumb: " + stopCheck);
      stopCheck = next(stopCheck);
    }
    return steps;
  }

  public String sequence(int nextSequence){
    int steps;
    String returnString = "";
    // Steps is set to 1, to account for 0
    for (steps = 0;nextSequence != 1;steps++) {
      // Debug - System.out.println("NextNumb: " + nextSequence);
      returnString = returnString + nextSequence + ", ";
      nextSequence = next(nextSequence);
    }
    // Loop will only leave, until 1 is met.
    return returnString = returnString + "1";
  }

  public static void main(String[] args) {
    // Collatz Object Printing Sequence till 20
    Collatz c = new Collatz();

    for (int counter = 1;counter < 21;counter++) {
      System.out.print(c.sequence(counter));
      System.out.println("");
    }
  }
}
