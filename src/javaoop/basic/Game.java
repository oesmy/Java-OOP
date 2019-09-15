package javaoop.basic;

public class Game {
    public static void main (String[] args){

//        Membuat obyek player
        Player petani = new Player();

//        Mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 0;

//        Menjalankan Method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
}
