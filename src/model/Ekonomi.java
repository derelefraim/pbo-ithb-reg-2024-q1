package model;

public class Ekonomi {
    int biayaParasut = 5000;

    public int getBiayaParasut() {
        return biayaParasut;
    }

    public void setBiayaParasut(int biayaParasut) {
        this.biayaParasut = biayaParasut;
    }

    public Ekonomi(int biayaParasut) {
        this.biayaParasut = biayaParasut;
    }
}
