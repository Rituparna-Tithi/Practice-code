
package encapsulation;


public class Encapsulation {

    
    public static void main(String[] args) {
        encap obj= new encap();//create obj
        obj.setAge(21);
        obj.setRoll(11);
        obj.Setname("Laxmi");
        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
        System.out.println("Roll: "+obj.getRoll());
        
        
        
       
    }
    
}
