import java.util.*;
import java.io.*;

class Main {

  public static String LetterCapitalize(String str) {
    // This function capitalizes the first letter of each word in a string.
    String[] words = str.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
      if (!word.isEmpty()) {
        char firstChar = Character.toUpperCase(word.charAt(0));
        result.append(firstChar).append(word.substring(1)).append(" ");
      }
    }

    return result.toString().trim();
  }

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}
