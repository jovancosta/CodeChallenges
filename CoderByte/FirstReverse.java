import java.util.*;

class Main {

  public static String FirstReverse(String str) {
    StringBuilder reversedStr = new StringBuilder(str);
    return reversedStr.reverse().toString();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine()));
    s.close();
  }
}
