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
        
        

         
    }
}
