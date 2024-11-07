package model;

public abstract class Tiket {
    int jarakTempuh;
    int bagasi;
    public Tiket(int jarakTempuh, int bagasi) {
        this.jarakTempuh = jarakTempuh;
        this.bagasi = bagasi;
    }
    // Bagasi saya masukkan ke abstract karena diminta di poin ke 3
    public int getJarakTempuh() {
        return jarakTempuh;
    }
    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public int getBagasi() {
        return bagasi;
    }
    public void setBagasi(int bagasi) {
        this.bagasi = bagasi;
    }
    
}
