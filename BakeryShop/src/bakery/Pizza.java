package bakery;

public class Pizza extends HargaPerGram {
    
    //Harga bahan yang diperlukan
    double pizzaTerigu = this.hargaPerGramTerigu * 1000;
    double pizzaGula = this.hargaPerGramGula * 100;
    double pizzaButter = this.hargaPerGramButter * 100;
    double pizzaRagi = this.hargaPerGramRagi * 20;
    double pizzaSusuBubuk = this.hargaPerGramSusuBubuk * 200;
    double pizzaSusuCair = this.hargaPerGramSusuCair * 180;
    double pizzaTelur = this.hargaPerGramTelur * 50;
    double pizzaEs = this.hargaPerGramEs * 300;

    //Total modal yang diperlukan untuk membuat 1 adonan pizza
    void pizzaTotalHarga(){
    double pizzaTotalHarga = this.pizzaTerigu + this.pizzaGula + this.pizzaButter + this.pizzaRagi + this.pizzaSusuBubuk + this.pizzaSusuCair + this.pizzaTelur + this.pizzaEs;
    }
    
    //Berat yang diperlukan untuk 1pcs Pizza
    double beratPizza = 190;

    //Pcs Pizza yang didapat dalam sekali membuat adonan
    double satuAdonanPizza = (1000 + 100 + 100 + 20 + 200 + 180 + 50 + 300) / this.beratPizza;

}
