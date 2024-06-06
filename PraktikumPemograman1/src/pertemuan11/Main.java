package pertemuan11;

import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException {
      while(true) {
         System.out.println("Enter postfix: ");
         System.out.flush();
         String input = getString();
         if (input.equals("")) {
            return;
         }

         ParsePost aParser = new ParsePost(input);
         int output = aParser.doParse();
         System.out.println("Hasil operasi: " + output);
      }
   }

   public static String getString() throws IOException {
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      return s;
   }
}
