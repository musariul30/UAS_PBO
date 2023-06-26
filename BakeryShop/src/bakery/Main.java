/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 * @author Musariul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("     HARGA JUAL ROTI PER PCS");
        System.out.println("===================================");
        RotiManis m = new RotiManis();
        m.printHargaManisV1();
        m.printHargaManisV2();
        m.printHargaManisV3(); 
        RotiTawar t = new RotiTawar();
        t.printHargaTawarV1();
        t.printHargaTawarV2();
        Pizza p = new Pizza();
        p.printHargaPizza();

        //Berat dan Kemasan RotiManisVar1 berdasarkan orderan
        BahanRotiManisV1 rmV1 = new BahanRotiManisV1();
        rmV1.orderan = 50;
        double kemasanRM1 = Math.ceil(rmV1.bahanTerigu()/1000);
        System.out.println("Tepung: " + Math.round(rmV1.bahanTerigu()) + " " + kemasanRM1 );

        //Berat dan Kemasan RotiManisVar2 berdasarkan orderan
        BahanRotiManisV2 rmV2 = new BahanRotiManisV2();
        rmV2.orderan = 100;
        double kemasanRM2 = Math.ceil(rmV2.bahanTerigu()/1000);
        System.out.println("Tepung: " + Math.round(rmV2.bahanTerigu()) + " " + kemasanRM2 );

         
    }
}
