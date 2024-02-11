import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the cards file:");
        String path = input.nextLine();

        try {
            Scanner file = new Scanner(new FileInputStream(path));
            boolean valid = true;

            while (file.hasNextLine()) {
                String[] sLine = file.nextLine().split(" ");
                if (sLine[0].equals(sLine[1]) && sLine[1].equals(sLine[2])) {
                  System.out.println("Processing: "+String.join(" ",sLine));
                  System.out.println("Valid");
                  valid = true;
                }
                else {
                  List<String> words = new ArrayList<>();
                  for (String k:sLine) {
                     StringTokenizer sl = new StringTokenizer(k,",");
                     while (sl.hasMoreElements()) {
                        String fg = sl.nextToken();
                        if (words.contains(fg)) {
                           valid = false;
                        }
                        else {
                           words.add(fg);
                        }
                     } 
                  }
                  System.out.println("Processing: "+String.join(" ",sLine));
                  System.out.println(valid? "Valid" : "Invalid");
                } 
                }
            }

         catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}