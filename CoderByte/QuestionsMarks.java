import java.util.*;

class Main {
  
  public static String QuestionsMarks(String str) {
    boolean foundDigit = false;
    int num1 = -1, num2 = -1;
    int questionCount = 0;

    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) {
        int num = Character.getNumericValue(c);
        if (foundDigit) {
          num2 = num;
          if (num1 + num2 == 10) {
            if (questionCount != 3) {
              return "false";
            }
          }
          questionCount = 0;
        } else {
          num1 = num;
          foundDigit = true;
        }
      } else if (c == '?') {
        if (foundDigit) {
          questionCount++;
        }
      }
    }

    return "true";
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine()));
    s.close();
  }
}
