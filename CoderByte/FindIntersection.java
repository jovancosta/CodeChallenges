import java.util.*;

class Main {
  public static String FindIntersection(String[] strArr) {
    String[] arr1 = strArr[0].split(", ");
    String[] arr2 = strArr[1].split(", ");

    List<String> intersection = new ArrayList<>();
    int i = 0, j = 0;

    while (i < arr1.length && j < arr2.length) {
      int num1 = Integer.parseInt(arr1[i]);
      int num2 = Integer.parseInt(arr2[j]);

      if (num1 == num2) {
        intersection.add(String.valueOf(num1));
        i++;
        j++;
      } else if (num1 < num2) {
        i++;
      } else {
        j++;
      }
    }

    if (intersection.isEmpty()) {
      return "false";
    } else {
      return String.join(",", intersection);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine()));
    s.close(); // Don't forget to close the scanner when done.
  }
}
