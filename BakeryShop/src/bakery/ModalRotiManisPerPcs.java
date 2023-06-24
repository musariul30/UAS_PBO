/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class ModalRotiManisPerPcs extends KomposisiRotiManisPerPcs{
    
    // Hitung modal per pcs Roti Manis
    double hargaTeriguPcsRotiManis = this.teriguPcsRotiManis * this.hargaPerGramTerigu;
    double hargaGulaPcsRotiManis = this.gulaPcsRotiManis * this.hargaPerGramGula;
    double hargaButterPcsRotiManis = this.butterPcsRotiManis * this.hargaPerGramButter;
    double hargaRagiPcsRotiManis = this.ragiPcsRotiManis * this.hargaPerGramRagi;
    double hargaSusuBubukPcsRotiManis = this.susuBubukPcsRotiManis * this.hargaPerGramSusuBubuk;
    double hargaSusuCairPcsRotiManis = this.susuCairPcsRotiManis * this.hargaPerGramSusuCair;
    double hargaTelurPcsRotiManis = this.TelurPcsRotiManis * this.hargaPerGramTelur;
    double hargaEsPcsRotiManis = this.esPcsRotiManis * this.hargaPerGramEs;
    
     double totalModalPcsRotiManis = this.hargaTeriguPcsRotiManis + this.hargaGulaPcsRotiManis + this.hargaButterPcsRotiManis + this.hargaRagiPcsRotiManis + this.hargaSusuBubukPcsRotiManis + this.hargaSusuCairPcsRotiManis + this.hargaTelurPcsRotiManis + this.hargaEsPcsRotiManis;

}
