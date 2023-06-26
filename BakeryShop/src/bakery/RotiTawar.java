package bakery;

public class RotiTawar extends HargaPerGram{
    
    double rotiTawarTerigu = 1000;
    double rotiTawarGula = 125;
    double rotiTawarButter = 100;
    double rotiTawarRagi = 20;
    double rotiTawarSusuBubuk = 250;
    double rotiTawarSusuCair = 200;
    double rotiTawarTelur = 70;
    double rotiTawarEs = 300;
    double rotiTawarTotal = 2065;
    double rotiTawarBeratPcs = 400;
    
    // Hitung banyak pcs roti tawar per adonan
    double rotiTawarPcs = this.rotiTawarTotal / this.rotiTawarBeratPcs;

    // Hitung bahan per pcs rotiTawar
    double teriguPcsRotiTawar = this.rotiTawarTerigu / this.rotiTawarPcs;
    double gulaPcsRotiTawar = this.rotiTawarGula / this.rotiTawarPcs;
    double butterPcsRotiTawar = this.rotiTawarButter / this.rotiTawarPcs;
    double ragiPcsRotiTawar = this.rotiTawarRagi / this.rotiTawarPcs;
    double susuBubukPcsRotiTawar = this.rotiTawarSusuBubuk / this.rotiTawarPcs;
    double susuCairPcsRotiTawar = this.rotiTawarSusuCair / this.rotiTawarPcs;
    double TelurPcsRotiTawar = this.rotiTawarTelur / this.rotiTawarPcs;
    double esPcsRotiTawar = this.rotiTawarEs / this.rotiTawarPcs;

    // Hitung modal per pcs roti tawar
    double hargaTeriguPcsRotiTawar = this.teriguPcsRotiTawar * this.hargaPerGramTerigu;
    double hargaGulaPcsRotiTawar = this.gulaPcsRotiTawar * this.hargaPerGramGula;
    double hargaButterPcsRotiTawar = this.butterPcsRotiTawar * this.hargaPerGramButter;
    double hargaRagiPcsRotiTawar = this.ragiPcsRotiTawar * this.hargaPerGramRagi;
    double hargaSusuBubukPcsRotiTawar = this.susuBubukPcsRotiTawar * this.hargaPerGramSusuBubuk;
    double hargaSusuCairPcsRotiTawar = this.susuCairPcsRotiTawar * this.hargaPerGramSusuCair;
    double hargaTelurPcsRotiTawar = this.TelurPcsRotiTawar * this.hargaPerGramTelur;
    double hargaEsPcsRotiTawar = this.esPcsRotiTawar * this.hargaPerGramEs;
    
    // Total modal per pcs roti tawar
    double totalModalPcsRotiTawar = this.hargaTeriguPcsRotiTawar + this.hargaGulaPcsRotiTawar + this.hargaButterPcsRotiTawar + this.hargaRagiPcsRotiTawar + this.hargaSusuBubukPcsRotiTawar + this.hargaSusuCairPcsRotiTawar + this.hargaTelurPcsRotiTawar + this.hargaEsPcsRotiTawar;

    // Harga jual roti tawar per pcs
    double hargaJualRotiTawarV1 = ( this.totalModalPcsRotiTawar +(this.hargaPerGramCoklat * 80) ) * 140/100 ;
    int hargaJualRotiTawarV1Bulat = (int) Math.ceil(hargaJualRotiTawarV1);
    double hargaJualRotiTawarV2 = ( this.totalModalPcsRotiTawar +(this.hargaPerGramKeju * 80) ) * 140/100 ;
    int hargaJualRotiTawarV2Bulat = (int) Math.ceil(hargaJualRotiTawarV2);
    
    // Print harga
    public void printHargaTawarV1(){
        System.out.println("Harga Roti Tawar Varian 1 : Rp " + this.hargaJualRotiTawarV1Bulat);
    }
     public void printHargaTawarV2(){
        System.out.println("Harga Roti Tawar Varian 2 : Rp " + this.hargaJualRotiTawarV2Bulat);
    }
}

