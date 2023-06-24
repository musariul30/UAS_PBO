/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class ModalPizzaPerPcs extends KomposisiPizzaPerPcs{
    
    // Hitung modal per pcs pizza
    double hargaTeriguPcsPizza = this.teriguPcsPizza * this.hargaPerGramTerigu;
    double hargaGulaPcsPizza = this.gulaPcsPizza * this.hargaPerGramGula;
    double hargaButterPcsPizza = this.butterPcsPizza * this.hargaPerGramButter;
    double hargaRagiPcsPizza = this.ragiPcsPizza * this.hargaPerGramRagi;
    double hargaSusuBubukPcsPizza = this.susuBubukPcsPizza * this.hargaPerGramSusuBubuk;
    double hargaSusuCairPcsPizza = this.susuCairPcsPizza * this.hargaPerGramSusuCair;
    double hargaTelurPcsPizza = this.TelurPcsPizza * this.hargaPerGramTelur;
    double hargaEsPcsPizza = this.esPcsPizza * this.hargaPerGramEs;
    
    double totalModalPcsPizza = this.hargaTeriguPcsPizza + this.hargaGulaPcsPizza + this.hargaButterPcsPizza + this.hargaRagiPcsPizza + this.hargaSusuBubukPcsPizza + this.hargaSusuCairPcsPizza + this.hargaTelurPcsPizza + this.hargaEsPcsPizza;

}
