import java.util.*;
import java.io.*;


public class Order {

   public static List<Integer> counter(String regex) {
      String[] seq = regex.split(" ");
      int count = 1;
      List<Integer> subs = new ArrayList<>();
      
      for (int k = 0;k<seq.length;k++) {
         String sLine = seq[k];
         
         if (seq.length==1) {
            subs.add(count);
         }
         
         else if (k<seq.length-1) {
            if (sLine.compareTo(seq[k+1]) < 0) {
               count++;
            }
            else {
               subs.add(count);
               count = 1;
            }
         }
         
         else if (k==seq.length-1 && seq[k].compareTo(seq[k-1]) > 0) {
            subs.add(count);
         }         
         else {
           count=1;
           subs.add(count);
         }  
      }
      return subs;
      
   }
   
   
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name of the word lists text file: ");
      
      
      try {
         String path = input.nextLine();
         Scanner file = new Scanner(new FileInputStream(path));
         
         while(file.hasNext()) {
            String line = file.nextLine();
            List<Integer> subs = counter(line);
            int max = 0; 
            int max2 = 0;
            for (Integer lk: subs) {
               if (lk > max) {
                  max = lk;
               }
               else if (lk == max && lk != 0) {
                  max2 = lk;
               }
            }
            if (max == max2) {
               System.out.println("Multiple solutions length " +max +".");  
            }
            else {
               System.out.println("Longest is "+max+"."); 
            }  
             
      }
      System.out.println("Done");
      } catch (FileNotFoundException e) {
         System.out.println(e.getMessage());
       }

}
}