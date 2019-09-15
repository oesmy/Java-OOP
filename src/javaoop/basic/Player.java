package javaoop.basic;

public class Player {

//    Definisi Atribut
    String name;
    int speed;
    int healthPoin;

//    Definisi Method Run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed "+ speed);
    }

//    Definisi method isDead untuk mengecek nilai kesehatan (healthpoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
