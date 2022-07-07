package edu.pdx.cs410J.TeamLucky13;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  static String compute(String number) {
    int num = Integer.parseInt(number);
    StringBuilder result = new StringBuilder();

    if (num % 3 == 0)
      result.append("Foo");
    if (num % 5 == 0)
      result.append("Bar");
    if (num % 7 == 0)
      result.append("Qix");

    digitMatch(number, result);

    return result.toString();
  }

  private static void digitMatch(String number, StringBuilder result) {
    for (char c : number.toCharArray()) {
      if (c == '3')
        result.append("Foo");
      else if (c == '5')
        result.append("Bar");
      else if (c == '7')
        result.append("Qix");
    }
  }
}