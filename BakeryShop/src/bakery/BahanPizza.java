/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class BahanPizza extends Pizza implements InterfaceHitungBahan{

    public int orderan;
    
    @Override
    public double bahanTerigu() {
        double hitung = this.teriguPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double bahanGula() {
        double hitung = this.gulaPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double bahanButter() {
        double hitung = this.butterPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double bahanRagi() {
        double hitung = this.ragiPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double bahanSusuBubuk() {
        double hitung = this.susuBubukPcsPizza * orderan; 
        return hitung;        
    }

    @Override
    public double bahanSusuCair() {
        double hitung = this.susuCairPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double bahanTelur() {
        double hitung = this.TelurPcsPizza * orderan;
        return hitung;
                
    }

    @Override
    public double bahanEs() {
        double hitung = this.esPcsPizza * orderan;
        return hitung;
    }

    @Override
    public double bahanKeju() {
        double hitung = 30 * orderan;
        return  hitung;
    }

    @Override
    public double bahanCoklat() {
        return 0;
    }

    @Override
    public double bahanVanila() {
        return 0;
    }

    @Override
    public double bahanRedBean() {
        return 0;
    }

    @Override
    public double bahanSosis() {
        double hitung = 50 * orderan;
        return  hitung;
    }

    @Override
    public double bahanBeef() {
        double hitung = 50 * orderan;
        return  hitung;
    }

    @Override
    public double bahanBombay() {
        double hitung = 30 * orderan;
        return hitung;
    }
    
}
