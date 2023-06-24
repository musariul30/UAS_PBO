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
    double hargaJualRotiManisV1 = ( (this.hargaPerGramKeju * 5) + (this.hargaPerGramCoklat * 10) ) * 140/100 ;
    double hargaJualRotiManisV2 = ( (this.hargaPerGramRedBean * 10) + (this.hargaPerGramVanila * 5) ) * 140/100 ;
    double hargaJualRotiManisV3 = ( (this.hargaPerGramKeju * 10) + (this.hargaPerGramSosis * 10) ) * 140/100 ;
}
