package controller;

public class Controller {
    public int hitungBiayaTiket(int jarak, int bagasi){ // Ekonomi
        int harga = 0;
        harga = 7500 * jarak;
        if (bagasi > 5) {
            harga += bagasi * 1500;
        }
        return harga + 5000;
    }
    public int hitungBiayaTiket(int jarak, int bagasi, boolean makanan){ // Bisnis
        int harga = 0;
        harga = 10000 * jarak;
        if (bagasi > 5) {
            harga += bagasi * 2500;
        }
        // Biaya makanan adalah 10% dari total pembelian yang ada
        if (makanan) {
            harga += harga/10;
        }
        return harga;
    }
    public int hitungBiayaTiket(int jarak){ // First
        int harga = 0;
        harga = 15000 * jarak;
        //Asuransi 
        harga += harga/10;
        return harga;
    }
}
