package model;

public class Bisnis extends Tiket {
    private int biayaMakanan;
    
    public Bisnis(int jarakTempuh, int bagasi, int harga, int biayaMakanan) {
        super(jarakTempuh, bagasi, harga);
        this.biayaMakanan = biayaMakanan;
    }

    public int getbiayaMakanan() {
        return biayaMakanan;
    }

    public void setbiayaMakanan(int biayaMakanan) {
        this.biayaMakanan = biayaMakanan;
    }

    public void sapa(){
        System.out.println("Selamat Datang di kelas Bisnis");
    }

}
