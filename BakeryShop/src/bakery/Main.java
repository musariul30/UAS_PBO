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

        System.out.println("======================================================================");
        System.out.println("                       BAHAN-BAHAN YANG DIBUTUHKAN");
        System.out.println("======================================================================");   
    
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
        double hitungRagi = Math.ceil(rmV1.bahanRagi() + rmV2.bahanRagi()+ rmV3.bahanRagi() + rtv1.bahanRagi()+ rtv2.bahanRagi()+ pv1.bahanRagi());
        double hitungSusuBubuk = Math.ceil(rmV1.bahanSusuBubuk() + rmV2.bahanSusuBubuk()+ rmV3.bahanSusuBubuk() + rtv1.bahanSusuBubuk()+ rtv2.bahanSusuBubuk()+ pv1.bahanSusuBubuk());
        double hitungSusuCair = Math.ceil(rmV1.bahanSusuCair() + rmV2.bahanSusuCair()+ rmV3.bahanSusuCair() + rtv1.bahanSusuCair()+ rtv2.bahanSusuCair()+ pv1.bahanSusuCair());
        double hitungTelur = Math.ceil(rmV1.bahanTelur() + rmV2.bahanTelur()+ rmV3.bahanTelur() + rtv1.bahanTelur()+ rtv2.bahanTelur()+ pv1.bahanTelur());
        double hitungEs = Math.ceil(rmV1.bahanEs() + rmV2.bahanEs()+ rmV3.bahanEs() + rtv1.bahanEs()+ rtv2.bahanEs()+ pv1.bahanEs());
        
        
        double hitungKemasanTerigu = Math.ceil(hitungTerigu/1000);
        double hitungKemasanGula = Math.ceil(hitungGula/1000);
        double hitungKemasanButter = Math.ceil(hitungButter/1000);
        double hitungKemasanRagi = Math.ceil(hitungRagi/1000);
        double hitungKemasanSusuBubuk = Math.ceil(hitungSusuBubuk/1000);
        double hitungKemasanSusuCair = Math.ceil(hitungSusuCair/1000);
        double hitungKemasanTelur = Math.ceil(hitungTelur/1000);
        double hitungKemasanEs = Math.ceil(hitungEs/1000);
        
        System.out.println("Tepung terigu yang dibutuhkan " + hitungTerigu + " gram" + " membutuhkan: " + hitungKemasanTerigu + " kemasan ");
        System.out.println("Gula yang dibutuhkan " + hitungGula + " gram" + " membutuhkan: " + hitungKemasanGula + " kemasan ");
        System.out.println("Butter yang dibutuhkan " + hitungButter + " gram" + " membutuhkan: " + hitungKemasanButter + " kemasan ");
        System.out.println("Ragi yang dibutuhkan " + hitungRagi + " gram" + " membutuhkan: " + hitungKemasanRagi + " kemasan ");
        System.out.println("Susu bubuk yang dibutuhkan " + hitungSusuBubuk + " gram" + " membutuhkan: " + hitungKemasanSusuBubuk + " kemasan ");
        System.out.println("Susu cair yang dibutuhkan " + hitungSusuCair + " gram" + " membutuhkan: " + hitungKemasanSusuCair + " kemasan ");
        System.out.println("Telur yang dibutuhkan " + hitungTelur + " gram" + " membutuhkan: " + hitungKemasanTelur + " kemasan ");
        System.out.println("Es batu yang dibutuhkan " + hitungEs + " gram" + " membutuhkan: " + hitungKemasanEs + " kemasan ");


         
    }
}
