package bakery;

public class RotiManis extends HargaPerGram{

    double rotiManisTerigu = 1000;
    double rotiManisGula = 150;
    double rotiManisButter = 150;
    double rotiManisRagi = 20;
    double rotiManisSusuBubuk = 300;
    double rotiManisSusuCair = 250;
    double rotiManisTelur = 80;
    double rotiManisEs = 400;
    double rotiManisTotal = 2350;
    double rotiManisBeratPcs = 50;
    
    // Hitung banyak pcs roti manis per adonan
    double rotiManisPcs = this.rotiManisTotal / this.rotiManisBeratPcs;

     // Hitung bahan per pcs roti manis
    double teriguPcsRotiManis = this.rotiManisTerigu / this.rotiManisPcs;
    double gulaPcsRotiManis = this.rotiManisGula / this.rotiManisPcs;
    double butterPcsRotiManis = this.rotiManisButter / this.rotiManisPcs;
    double ragiPcsRotiManis = this.rotiManisRagi / this.rotiManisPcs;
    double susuBubukPcsRotiManis = this.rotiManisSusuBubuk / this.rotiManisPcs;
    double susuCairPcsRotiManis = this.rotiManisSusuCair / this.rotiManisPcs;
    double TelurPcsRotiManis = this.rotiManisTelur / this.rotiManisPcs;
    double esPcsRotiManis = this.rotiManisEs / this.rotiManisPcs;

    // Hitung modal per pcs roti manis
    double hargaTeriguPcsRotiManis = this.teriguPcsRotiManis * this.hargaPerGramTerigu;
    double hargaGulaPcsRotiManis = this.gulaPcsRotiManis * this.hargaPerGramGula;
    double hargaButterPcsRotiManis = this.butterPcsRotiManis * this.hargaPerGramButter;
    double hargaRagiPcsRotiManis = this.ragiPcsRotiManis * this.hargaPerGramRagi;
    double hargaSusuBubukPcsRotiManis = this.susuBubukPcsRotiManis * this.hargaPerGramSusuBubuk;
    double hargaSusuCairPcsRotiManis = this.susuCairPcsRotiManis * this.hargaPerGramSusuCair;
    double hargaTelurPcsRotiManis = this.TelurPcsRotiManis * this.hargaPerGramTelur;
    double hargaEsPcsRotiManis = this.esPcsRotiManis * this.hargaPerGramEs;
    
    // Total modal per pcs roti manis
    double totalModalPcsRotiManis = this.hargaTeriguPcsRotiManis + this.hargaGulaPcsRotiManis + this.hargaButterPcsRotiManis + this.hargaRagiPcsRotiManis + this.hargaSusuBubukPcsRotiManis + this.hargaSusuCairPcsRotiManis + this.hargaTelurPcsRotiManis + this.hargaEsPcsRotiManis;

    // Hitung harga jual varian roti manis per pcs
    double hargaJualRotiManisV1 = ( this.totalModalPcsRotiManis + (this.hargaPerGramKeju * 5) + (this.hargaPerGramCoklat * 10) ) * 140/100 ;
    int hargaJualRotiManisV1Bulat = (int) Math.ceil(hargaJualRotiManisV1);
    double hargaJualRotiManisV2 = ( this.totalModalPcsRotiManis + (this.hargaPerGramRedBean * 10) + (this.hargaPerGramVanila * 5) ) * 140/100 ;
    int hargaJualRotiManisV2Bulat = (int) Math.ceil(hargaJualRotiManisV2);
    double hargaJualRotiManisV3 = ( this.totalModalPcsRotiManis + (this.hargaPerGramKeju * 10) + (this.hargaPerGramSosis * 10) ) * 140/100 ;
    int hargaJualRotiManisV3Bulat = (int) Math.ceil(hargaJualRotiManisV3);
    
    // Print harga
    public void printHargaManisV1(){
        System.out.println("Harga Roti Manis Varian 1 : Rp " + this.hargaJualRotiManisV1Bulat);
    }
     public void printHargaManisV2(){
        System.out.println("Harga Roti Manis Varian 2 : Rp " + this.hargaJualRotiManisV2Bulat);
    }
      public void printHargaManisV3(){
        System.out.println("Harga Roti Manis Varian 3 : Rp " + this.hargaJualRotiManisV3Bulat);
    }
}

