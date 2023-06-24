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
    double hargaJualRotiTawarV1 = ( this.totalModalPcsRotiTawar +(this.hargaPerGramCoklat * 80) ) * 140/100 ;
    int hargaJualRotiTawarV1Bulat = (int) Math.ceil(hargaJualRotiTawarV1);
    double hargaJualRotiTawarV2 = ( this.totalModalPcsRotiTawar +(this.hargaPerGramKeju * 80) ) * 140/100 ;
    int hargaJualRotiTawarV2Bulat = (int) Math.ceil(hargaJualRotiTawarV2);
    
    // Print harga
    public void printHargaTawarV1(){
        System.out.println("Harga Roti Tawar Varian 1 Rp: " + this.hargaJualRotiTawarV1Bulat);
    }
     public void printHargaTawarV2(){
        System.out.println("Harga Roti Tawar Varian 2 Rp: " + this.hargaJualRotiTawarV2Bulat);
    }
}
