/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class ModalRotiTawarPerPcs extends KomposisiRotiTawarPerPcs{
    
    // Hitung modal per pcs roti tawar
    double hargaTeriguPcsRotiTawar = this.teriguPcsRotiTawar * this.hargaPerGramTerigu;
    double hargaGulaPcsRotiTawar = this.gulaPcsRotiTawar * this.hargaPerGramGula;
    double hargaButterPcsRotiTawar = this.butterPcsRotiTawar * this.hargaPerGramButter;
    double hargaRagiPcsRotiTawar = this.ragiPcsRotiTawar * this.hargaPerGramRagi;
    double hargaSusuBubukPcsRotiTawar = this.susuBubukPcsRotiTawar * this.hargaPerGramSusuBubuk;
    double hargaSusuCairPcsRotiTawar = this.susuCairPcsRotiTawar * this.hargaPerGramSusuCair;
    double hargaTelurPcsRotiTawar = this.TelurPcsRotiTawar * this.hargaPerGramTelur;
    double hargaEsPcsRotiTawar = this.esPcsRotiTawar * this.hargaPerGramEs;
    
    double totalModalPcsRotiTawar = this.hargaTeriguPcsRotiTawar + this.hargaGulaPcsRotiTawar + this.hargaButterPcsRotiTawar + this.hargaRagiPcsRotiTawar + this.hargaSusuBubukPcsRotiTawar + this.hargaSusuCairPcsRotiTawar + this.hargaTelurPcsRotiTawar + this.hargaEsPcsRotiTawar;

}
