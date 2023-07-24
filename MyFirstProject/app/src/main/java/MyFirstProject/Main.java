
package MyFirstProject;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class Main {
    
    public static void main(String[] args) {
              
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many numbers will you type? ");
        int n = sc.nextInt(); 
        
        for (int i = 0; i < n; i++) {
            System.out.println("Type the #" + i + 1 + "number: ");
            int number = sc.nextInt();
            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else 
                System.out.println("Zero");
        }
                  
        
        sc.close();
        
       
    }
}
