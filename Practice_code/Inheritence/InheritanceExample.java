
package inheritance.example;
import java.util.Scanner;

public class InheritanceExample {

    
    public static void main(String[] args) {
        cars car= new cars();
        bikes bike= new bikes();
        planes plane= new planes();
        Scanner s = new Scanner(System.in);
        car.year=2014;
        car.speed=100;
        car.fuel="10 L";
        
        bike.year=2010;
        bike.speed= 200;
        bike.fuel="20 L";
        
        plane.year= 2019;
        plane.speed= 30;
        plane.fuel=" 50 L";
        
        System.out.println("we have three model");
        System.out.println("1.Cars");
        System.out.println("2.bikes");
        System.out.println("3.Planes");
        System.out.println("Enter your choice:");
        
        int ch;   //declare variable
        ch= s.nextInt();
        
       
                if(ch==1){
                    System.out.println("year of manufacture:"+car.year);
                    System.out.println("Maximum speed :"+car.speed);
                    System.out.println("year of manufacture:"+car.fuel);


                    
                }
                else if(ch==2){
                    System.out.println("year of manufacture:" +bike.year);
                    System.out.println("year of speed:"+bike.speed);
                    System.out.println("year of manufacture:"+bike.fuel);
                  }
                else if(ch==3){
                     System.out.println("year of manufacture:"+plane.year);
                    System.out.println("year of speed:"+plane.speed);
                    System.out.println("year of manufacture:"+plane.fuel);

                    
        
    }
                else{
                    System.out.println("Enter your choice between 1 & 3");
                }
        
        
   
        
        
        
    }
    
}
