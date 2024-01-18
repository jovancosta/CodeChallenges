import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiplesof3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            long sumOfMultiples3 = calculateSumOfMultiples(n, 3);
            long sumOfMultiples5 = calculateSumOfMultiples(n, 5);
            long sumOfMultiples15 = calculateSumOfMultiples(n, 15);
            
            long sum = sumOfMultiples3 + sumOfMultiples5 - sumOfMultiples15;
            
            System.out.println(sum);
        }
    }
    
    // Function to calculate the sum of multiples of 'multiple' up to 'n'
    private static long calculateSumOfMultiples(int n, int multiple) {
        long p = (n - 1) / multiple;
        return multiple * (p * (p + 1)) / 2;
    }
}
