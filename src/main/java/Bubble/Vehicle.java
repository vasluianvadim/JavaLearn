package Bubble;

public interface Vehicle {
    void porneste();

    default void opreste(){
        System.out.println("Vehicolul se opreste");
    }
    default void frineaza(){
        System.out.println("Vehicolul frineaza");
    }
}
