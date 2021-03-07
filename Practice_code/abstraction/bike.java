
package abstraction;


abstract class bike {
    bike(){
        System.out.println("bike started");
    }
    abstract void run();
    abstract void stop();
    abstract void ABS();
    void changegear(){
        System.out.println("Bike changed gear");
    }
}
