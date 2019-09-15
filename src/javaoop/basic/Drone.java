package javaoop.basic;

public class Drone {
//    Attribute
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

//    Method
    void terbang(){
        energi--;
        if(energi > 10) {
//            terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone Terbang");
        }else{
            System.out.println("Energi Lemah : Drone Nggak Bisa Terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("Mesin Dimatikan");
        }
    }

    void turun(){
//        Ketinggian berkurang karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok(){
        energi--;
        System.out.println("Drone Belok");
    }

    void maju(){
        energi--;
        System.out.println("Drone Maju");
    }

    void mundur(){
        energi--;
        System.out.println("Drone Mundur");
        kecepatan++;
    }
}
