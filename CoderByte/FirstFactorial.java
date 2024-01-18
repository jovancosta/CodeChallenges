import java.util.*;

class Main {

  public static int FirstFactorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    } else {
      return num * FirstFactorial(num - 1);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = 4; // Replace 4 with the desired integer input
    System.out.print(FirstFactorial(num));
    s.close();
  }
}
