
package overridding;
import java.util.Scanner;


public class Overridding {
  
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BMW c1=new BMW();
        Audi c2= new Audi();
        Marcedes c3= new Marcedes();
        int ch;
        System.out.println("We have three model: ");
        System.out.println("1.BMW");
        System.out.println("2.Audi");
        System.out.println("3.Marcedes");
        System.out.println("Enter your choice");
        
        ch= s.nextInt();
        if (ch==1){
            System.out.println("Top speed of BMW is:"+c1.topspeed());
            
            }
        else if(ch==2){
            System.out.println("Top speed of Audi is:"+c2.topspeed());
        }
        else if(ch==3){
            System.out.println("Top speed of Marcedes is:"+c3.topspeed());
        }
        else{
            System.out.println("Please enter value 1&3");
        }
        
        
    }
    
}
