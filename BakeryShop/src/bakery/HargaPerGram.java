/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class HargaPerGram {
    
    //Berat Bahan dan Filling Topping (dalam gram)
    double beratTerigu = 1000;
    double beratGula = 1000;
    double beratButter = 500;
    double beratRagi = 11;
    double beratSusuBubuk = 1000;
    double beratSusuCair = 1000;
    double beratTelur = 1000;
    double beratEs = 1000;
    double beratKeju = 250;
    double beratCoklat = 500;
    double beratVanila = 500;
    double beratRedBean = 500;
    double beratSosis = 1000;
    double beratBeef = 1000;
    double beratBombay = 500;

    // Harga Bahan dan Filling Topping
    double hargaTerigu = 40000;
    double hargaGula = 25000;
    double hargaButter = 23000;
    double hargaRagi = 5000;
    double hargaSusuBubuk = 39000;
    double hargaSusuCair = 24000;
    double hargaTelur = 23000;
    double hargaEs = 2000;
    double hargaKeju = 31000;
    double hargaCoklat = 29000;
    double hargaVanila = 30000;
    double hargaRedBean = 25000;
    double hargaSosis = 80000;
    double hargaBeef = 90000;
    double hargaBombay = 40000;
    
    //Harga per gram
    double hargaPerGramTerigu = this.hargaTerigu / this.beratTerigu;
    double hargaPerGramGula = this.hargaGula / this.beratGula;
    double hargaPerGramButter = this.hargaButter / this.beratButter;
    double hargaPerGramRagi = this.hargaRagi / this.beratRagi;
    double hargaPerGramSusuBubuk = this.hargaSusuBubuk / this.beratSusuCair;
    double hargaPerGramSusuCair = this.hargaSusuCair / this.beratSusuCair;
    double hargaPerGramTelur = this.hargaTelur / this.beratTelur;
    double hargaPerGramEs = this.hargaEs / this.beratEs;
    double hargaPerGramKeju = this.hargaKeju / this.beratKeju;
    double hargaPerGramCoklat = this.hargaCoklat / this.beratCoklat;
    double hargaPerGramVanila = this.hargaVanila / this.beratVanila;
    double hargaPerGramRedBean = this.hargaRedBean / this.beratRedBean;
    double hargaPerGramSosis = this.hargaSosis / this.beratSosis;
    double hargaPerGramBeef = this.hargaBeef / this.beratBeef;
    double hargaPerGramBombay = this.hargaBombay /this.beratBombay;
}
