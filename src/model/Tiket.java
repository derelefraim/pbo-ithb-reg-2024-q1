package model;

public abstract class Tiket {
    private int jarakTempuh;
    private int bagasi;
    private int harga;
    
    public Tiket(int jarakTempuh, int bagasi, int harga) {
        this.jarakTempuh = jarakTempuh;
        this.bagasi = bagasi;
        this.harga = harga;
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
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
