
package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
        multiply m = new multiply();
        
        System.out.println(m.multiply(2,3));
        System.out.println(m.multiply(3.3,6.6));
        System.out.println(m.multiply(3,4, 5));
        
        
    }
    
}
