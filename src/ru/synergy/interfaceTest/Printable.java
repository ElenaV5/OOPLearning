package ru.synergy.interfaceTest;

public interface Printable {
    void print();

    /*static void read(){
        System.out.println("Read printable");
    }*/

    /*default void read(){
        System.out.println("Read printable ");
    }*/

    default void read(String appendString) {
        System.out.println("Read printable " + "//// Appended string //// -> " + appendString);
    }
}
