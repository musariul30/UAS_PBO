package bakery;

public class Pizza extends HargaPerGram {
    
    // Berat adonan bahan pizza
    double pizzaTerigu = 1000;
    double pizzaGula = 100;
    double pizzaButter = 100;
    double pizzaRagi = 20;
    double pizzaSusuBubuk = 200;
    double pizzaSusuCair = 180;
    double pizzaTelur = 50;
    double pizzaEs = 300;
    double pizzaTotal = 1950;
    double pizzaBeratPcs = 190;
    
    // Hitung banyak pcs pizza per adonan
    double pizzaPcs = this.pizzaTotal / this.pizzaBeratPcs;

    // Hitung bahan per pcs pizza
    double teriguPcsPizza = this.pizzaTerigu / this.pizzaPcs;
    double gulaPcsPizza = this.pizzaGula / this.pizzaPcs;
    double butterPcsPizza = this.pizzaButter / this.pizzaPcs;
    double ragiPcsPizza = this.pizzaRagi / this.pizzaPcs;
    double susuBubukPcsPizza = this.pizzaSusuBubuk / this.pizzaPcs;
    double susuCairPcsPizza = this.pizzaSusuCair / this.pizzaPcs;
    double TelurPcsPizza = this.pizzaTelur / this.pizzaPcs;
    double esPcsPizza = this.pizzaEs / this.pizzaPcs;

    // Hitung modal per pcs pizza
    double hargaTeriguPcsPizza = this.teriguPcsPizza * this.hargaPerGramTerigu;
    double hargaGulaPcsPizza = this.gulaPcsPizza * this.hargaPerGramGula;
    double hargaButterPcsPizza = this.butterPcsPizza * this.hargaPerGramButter;
    double hargaRagiPcsPizza = this.ragiPcsPizza * this.hargaPerGramRagi;
    double hargaSusuBubukPcsPizza = this.susuBubukPcsPizza * this.hargaPerGramSusuBubuk;
    double hargaSusuCairPcsPizza = this.susuCairPcsPizza * this.hargaPerGramSusuCair;
    double hargaTelurPcsPizza = this.TelurPcsPizza * this.hargaPerGramTelur;
    double hargaEsPcsPizza = this.esPcsPizza * this.hargaPerGramEs;
    
    // Total modal per pcs pizza
    double totalModalPcsPizza = this.hargaTeriguPcsPizza + this.hargaGulaPcsPizza + this.hargaButterPcsPizza + this.hargaRagiPcsPizza + this.hargaSusuBubukPcsPizza + this.hargaSusuCairPcsPizza + this.hargaTelurPcsPizza + this.hargaEsPcsPizza;

    // Hitung harga jual varian roti pizza per pcs
    double hargaJualPizzaV1 = ( this.totalModalPcsPizza +(this.hargaPerGramKeju * 30) + (this.hargaPerGramSosis * 50) + (this.hargaPerGramBeef * 50) + (this.hargaPerGramBombay * 30) ) * 140/100 ;
    int hargaJualPizzaV1Bulat = (int) Math.ceil(hargaJualPizzaV1);
    
    // Print harga
    public void printHargaPizza(){
        System.out.println("Harga Pizza Varian 1      : Rp " + this.hargaJualPizzaV1Bulat);
    }
    

}
