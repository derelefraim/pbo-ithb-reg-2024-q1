package model;

public class Ekonomi extends Tiket{
    private int biayaParasut;

    public Ekonomi(int jarakTempuh, int bagasi, int harga, int biayaParasut) {
        super(jarakTempuh, bagasi, harga);
        this.biayaParasut = biayaParasut;
    }

    public int getBiayaParasut() {
        return biayaParasut;
    }

    public void setBiayaParasut(int biayaParasut) {
        this.biayaParasut = biayaParasut;
    }

    public void sapa(){
        System.out.println("Selamat Datang di kelas Ekonomi");
    }
    
}
