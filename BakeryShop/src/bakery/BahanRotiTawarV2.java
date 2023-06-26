/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class BahanRotiTawarV2 extends RotiTawar implements InterfaceHitungBahan{

    public int orderan;
    @Override
    public double bahanTerigu() {
        double hitung = this.teriguPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double bahanGula() {
        double hitung = this.gulaPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double bahanButter() {
        double hitung = this.butterPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double bahanRagi() {
        double hitung = this.ragiPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double bahanSusuBubuk() {
        double hitung = this.susuBubukPcsRotiTawar * orderan; 
        return hitung;        
    }

    @Override
    public double bahanSusuCair() {
        double hitung = this.susuCairPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double bahanTelur() {
        double hitung = this.TelurPcsRotiTawar * orderan;
        return hitung;
                
    }

    @Override
    public double bahanEs() {
        double hitung = this.esPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double bahanKeju() {
        double hitung = 80 * orderan;
        return hitung;
    }

    @Override
    public double bahanCoklat() {
        return  0;
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
        return 0;
    }

    @Override
    public double bahanBeef() {
        return 0;
    }

    @Override
    public double bahanBombay() {
        return 0;
    }
    
}
