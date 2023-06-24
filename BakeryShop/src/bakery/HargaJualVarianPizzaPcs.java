/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Musariul
 */
public class HargaJualVarianPizzaPcs extends ModalPizzaPerPcs {
    
    // Hitung harga jual varian roti pizza per pcs
    double hargaJualPizzaV1 = ( (this.hargaPerGramKeju * 30) + (this.hargaPerGramSosis * 50) + (this.hargaPerGramBeef * 50) + (this.hargaPerGramBombay * 30) ) * 140/100 ;
}
