/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class BahanRotiManisV2 extends RotiManis implements InterfaceKebutuhanBahan{

    public int orderan;
    
   @Override
    public double hitungTerigu() {
        double hitung = this.teriguPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butterPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragiPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubukPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCairPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.TelurPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esPcsRotiManis * orderan;
        return hitung;
    }

}
    

