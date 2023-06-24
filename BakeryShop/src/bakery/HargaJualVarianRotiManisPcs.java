/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Musariul
 * @author Arnella
 */
public class HargaJualVarianRotiManisPcs extends ModalRotiManisPerPcs{
    
    // Hitung harga jual varian roti manis per pcs
    double hargaJualRotiManisV1 = ( (this.hargaPerGramKeju * 5) + (this.hargaPerGramCoklat * 10) ) * 140/100 ;
    double hargaJualRotiManisV2 = ( (this.hargaPerGramRedBean * 10) + (this.hargaPerGramVanila * 5) ) * 140/100 ;
    double hargaJualRotiManisV3 = ( (this.hargaPerGramKeju * 10) + (this.hargaPerGramSosis * 10) ) * 140/100 ;
    
    // Print harga
    public void printHargaManisV1(){
        System.out.println("Harga Roti Manis Varian 1 Rp: " + this.hargaJualRotiManisV1);
    }
     public void printHargaManisV2(){
        System.out.println("Harga Roti Manis Varian 2 Rp: " + this.hargaJualRotiManisV2);
    }
      public void printHargaManisV3(){
        System.out.println("Harga Roti Manis Varian 3 Rp: " + this.hargaJualRotiManisV3);
    }
}
