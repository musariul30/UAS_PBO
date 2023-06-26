package bakery;

public class BahanRotiManisV1 extends RotiManis implements InterfaceHitungBahan{

    public int orderan;
    
    @Override
    public double bahanTerigu() {
        double hitung = this.teriguPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double bahanGula() {
        double hitung = this.gulaPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double bahanButter() {
        double hitung = this.butterPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double bahanRagi() {
        double hitung = this.ragiPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double bahanSusuBubuk() {
        double hitung = this.susuBubukPcsRotiManis * orderan; 
        return hitung;        
    }

    @Override
    public double bahanSusuCair() {
        double hitung = this.susuCairPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double bahanTelur() {
        double hitung = this.TelurPcsRotiManis * orderan;
        return hitung;
                
    }

    @Override
    public double bahanEs() {
        double hitung = this.esPcsRotiManis * orderan;
        return hitung;
    }

    @Override
    public double bahanKeju() {
        double hitung = 5 * orderan;
        return  hitung;
    }

    @Override
    public double bahanCoklat() {
        double hitung = 10 * orderan;
        return  hitung;
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
