import java.util.*;
import java.io.*;

class Main {

  public static String LongestWord(String sen) {
    String[] words = sen.split("[^a-zA-Z0-9]+");
    String longestWord = "";

    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }

    return longestWord;
  }

  public static void main (String[] args) {  
    // __define-ocg__ This function finds the longest word in a given string.
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}
