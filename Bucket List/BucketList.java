import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BucketList {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name of the categories file:");
      String path = input.nextLine();
      try {
         final Scanner file = new Scanner(new FileInputStream(path));
   
         List<String> categs = new ArrayList<>();
         List<String> words = new ArrayList<>();
         Map<String, List<String>> categories = new HashMap<>();
         categories.put("Uncategorised:", words);
   
         while (file.hasNext()) {
            String sLine = file.nextLine().strip();
            categs.add(sLine);
            categories.put(sLine, new ArrayList<>());
         }
   
         System.out.println("Enter a comma-separated list of words:");
         StringTokenizer lines = new StringTokenizer(input.nextLine(), ", ");
   
         while (lines.hasMoreTokens()) {
            String word = lines.nextToken();
            String max = "";
            for (String c : categs) {
               if (word.startsWith(c) && c.length() > max.length()) {
                  max = c;
               }
            }
            if (max.length() > 0) {
               List<String> newList = categories.get(max);
               newList.add(word);
               categories.put(max, newList);
            } else {
               words.add(word);
            }
         }
         
         System.out.println("Categorised:");
         for (String l: categs) {
            String conc = categories.get(l).toString();
            String finl = conc.length() == 2 ? "":conc.substring(1,conc.length()).replace("]",".");
            System.out.println(l+": "+finl);
         }
         if (categories.get("Uncategorised:").size() > 0) {
            System.out.println("Uncategorised:");
            String con = categories.get("Uncategorised:").toString();
            String fin = con.substring(1,con.length()).replace("]",".");
            System.out.println(fin);        
         }
         System.out.println("Done");
         
      } catch (FileNotFoundException e) {
         System.out.println(e.getMessage());
      }
   }

}
