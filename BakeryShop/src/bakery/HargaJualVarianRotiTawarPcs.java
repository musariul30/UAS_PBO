/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Musariul
 */
public class HargaJualVarianRotiTawarPcs extends ModalRotiTawarPerPcs {
    
    // Hitung harga jual varian roti tawar per pcs
    double hargaJualRotiTawarV1 = ( (this.hargaPerGramCoklat * 80) ) * 140/100 ;
    double hargaJualRotiTawarV2 = ( (this.hargaPerGramKeju * 80) ) * 140/100 ;

    // Print harga
    public void printHargaTawarV1(){
        System.out.println("Harga Roti Tawar Varian 1 Rp: " + this.hargaJualRotiTawarV1);
    }
     public void printHargaTawarV2(){
        System.out.println("Harga Roti Tawar Varian 2 Rp: " + this.hargaJualRotiTawarV2);
    }
}
