
package factorial;
import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count=1;
        System.out.print("Enter any positive integer ");
        num = input.nextInt();
        for(int i =num;i>=1;i--){
            count = count*i;
            
            
            
        }
        System.out.println("Facorial of"+num+" = "+count);
         
        
    }
    
}
