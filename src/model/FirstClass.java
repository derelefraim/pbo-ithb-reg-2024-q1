package model;

public class FirstClass extends Tiket {
    private int asuransi;

    public FirstClass(int jarakTempuh, int bagasi, int harga, int asuransi) {
        super(jarakTempuh, bagasi, harga);
        this.asuransi = asuransi;
    }

    public int getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(int asuransi) {
        this.asuransi = asuransi;
    }
    public void sapa(){
        System.out.println("Selamat Datang di First Class");
    }
}
