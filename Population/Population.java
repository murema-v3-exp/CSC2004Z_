import java.util.*;
import java.io.*;


public class Population {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the file name:");
      String path = input.nextLine();
      try {
      Scanner file = new Scanner(new FileInputStream(path));
      
      int capacity = Integer.parseInt(file.nextLine());
      List<String> crits = new ArrayList<>();
      crits.add(0, "nex");
      
      for (int i = 1;i<capacity+1;i++) {
         crits.add(i,file.nextLine());
      }
      
      int req = Integer.parseInt(file.nextLine());
      int[][] reqs = new int[req][2];
      for (int k = 0;k<req;k++) {
         StringTokenizer sl = new StringTokenizer(file.nextLine());
         reqs[k][0] = Integer.parseInt(sl.nextToken());
         reqs[k][1] = Integer.parseInt(sl.nextToken());  
      }
      
      for (int[] l: reqs) {
         StringBuilder result = new StringBuilder();
         char[] a = crits.get(l[0]).toCharArray();
         char[] b = crits.get(l[1]).toCharArray();
         int k = 0;
         for (int r = 0;r<a.length;r++) {
            if (result.length() < 10) {
               if (b.length > r) {
                  result.append(a[r]).append(b[r]);
               }
               else {
                  result.append(a[r]);
                  }
            }
            k = r;
         }
         if (a.length < b.length) {
            for (int s = k+1;s<b.length;s++) {
               if (result.length() < 10) {
                  result.append(b[s]);
               }
            }
         }
         crits.add(result.toString());
      }
      
      for (String cri: crits) {
         if (cri.equals("nex") ){continue;}
         System.out.printf("[%s]\n",cri);
      }
  
   } catch (FileNotFoundException e) {
         System.out.println(e.getMessage());
      }
  }

}