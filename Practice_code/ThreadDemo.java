
package threaddemo;

class Hi{
    public void show(){
        for(int i =0;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000); }catch(Exception e){}
        }
    }
}
class Hello{
    public void show(){
        for(int i=0;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch(Exception e){}
            
            
        }
    }
}


public class ThreadDemo {

    
    public static void main(String[] args) {
        Hi obj1=new Hi();
        Hello obbj2=new Hello();
        obj1.show();
        obbj2.show();
    }
    
}
