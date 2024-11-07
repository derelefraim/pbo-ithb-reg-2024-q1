package model;

public class FirstClass extends Tiket {
    int asuransi;

    public FirstClass(int jarakTempuh, int bagasi, int asuransi) {
        super(jarakTempuh, bagasi);
        this.asuransi = asuransi;
    }

    public int getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(int asuransi) {
        this.asuransi = asuransi;
    }
}
