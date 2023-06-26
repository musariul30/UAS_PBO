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

        System.out.println("===================================");
        System.out.println("     BAHAN YANG DIBUTUHKAN");
        System.out.println("===================================");   
    
        BahanRotiManisV1 rmV1 = new BahanRotiManisV1();
        BahanRotiManisV2 rmV2 = new BahanRotiManisV2();
        BahanRotiManisV1 rmV3 = new BahanRotiManisV1();
        BahanRotiTawarV1 rtv1 = new BahanRotiTawarV1();
        BahanRotiTawarV1 rtv2 = new BahanRotiTawarV1();
        BahanPizza pv1 = new BahanPizza();
        
        rmV1.orderan = 50;
        rmV2.orderan = 100;
        rmV3.orderan = 70;
        rtv1.orderan = 20;
        rtv2.orderan = 15;
        pv1.orderan = 10;
        
        double hitungTerigu = Math.ceil(rmV1.bahanTerigu() + rmV2.bahanTerigu()+ rmV3.bahanTerigu() + rtv1.bahanTerigu()+ rtv2.bahanTerigu()+ pv1.bahanTerigu());
        double hitungGula = Math.ceil(rmV1.bahanGula() + rmV2.bahanGula()+ rmV3.bahanGula() + rtv1.bahanGula()+ rtv2.bahanGula()+ pv1.bahanGula());
        double hitungButter = Math.ceil(rmV1.bahanButter() + rmV2.bahanButter()+ rmV3.bahanButter() + rtv1.bahanButter()+ rtv2.bahanButter()+ pv1.bahanButter());
        
        
        double hitungKemasanTerigu = Math.ceil(hitungTerigu/1000);
        double hitungKemasanGula = Math.ceil(hitungGula/1000);
        
        System.out.println("Tepung terigu yang dibutuhkan " + hitungTerigu + " gram" + " membutuhkan: " + hitungKemasanTerigu + " kemasan ");
        System.out.println("Tepung terigu yang dibutuhkan " + hitungTerigu + " gram" + " membutuhkan: " + hitungKemasanGula + " kemasan ");


         
    }
}
