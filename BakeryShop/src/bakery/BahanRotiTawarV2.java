/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class BahanRotiTawarV2 extends RotiTawar implements InterfaceKebutuhanBahan{

    public int orderan;
    
    @Override
    public double hitungTerigu() {
        double hitung = this.teriguPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butterPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragiPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubukPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCairPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.TelurPcsRotiTawar * orderan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esPcsRotiTawar * orderan;
        return hitung;
    }
    
}
