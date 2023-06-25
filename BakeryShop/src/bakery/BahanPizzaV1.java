/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class BahanPizzaV1 extends Pizza implements InterfaceKebutuhanBahan{

    public int orderan;
    
    @Override
    public double hitungTerigu() {
        double hitung = this.teriguPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butterPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragiPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubukPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCairPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.TelurPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esPcsPizza * orderan;
        return hitung;
    }
    
}
