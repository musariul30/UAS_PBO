package tokoroti;

public class Bahan {
    private String nama;
    private double berat;
    private double harga;

    public Bahan(String nama, double berat, double price){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getBerat(){
        return berat;
    }

    public double getHarga(){
        return harga;
    }

}
