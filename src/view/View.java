package view;

import java.util.Scanner;
import controller.*;
import model.*;
    import java.util.ArrayList;

public class View {
    Controller controller = new Controller();
    Scanner scan = new Scanner(System.in);
    ArrayList<Tiket> tiket = new ArrayList();
    int index = 0;

    public void showMakanan() {
        System.out.println("1: Gulai");
        System.out.println("2: Rendang");
        System.out.println("3: Nasi Goreng");
        System.out.println("4: Croissant");
        System.out.println("5: Pempek Kapal Selam Langsung Dari Palembang BUSET");
        System.out.println("0: Ga dulu Mas");
    }

    public void menuAwal() {
        boolean repeat = true;
        System.out.println("Selamat Datang, Silakan Memilih Tipe tiket (1-3)");
        while (repeat) {
            System.out.println("1. Ekonomi \n2. Bisnis \n3. First Class");
            int pilih = scan.nextInt();
            int bagasi = 0;
            int jarak = 0;
            boolean makanan = false;
            int pilihMakan;
            boolean lagi;
            int harga = 0;
            switch (pilih) {
                case 1: // Ekonomi
                    System.out.println("Silakan Masukkan nominal jarak : ");
                    jarak = scan.nextInt();
                    System.out.println("Silakan Masukkan nominal berat bagasi : ");
                    bagasi = scan.nextInt();
                    harga = controller.hitungBiayaTiket(jarak, bagasi);
                    tiket.add(new Ekonomi(jarak, bagasi, harga, 5000));
                    break;

                case 2: // Bisnis
                    System.out.println("Silakan Masukkan nominal jarak : ");
                    jarak = scan.nextInt();
                    System.out.println("Silakan Masukkan nominal berat bagasi : ");
                    bagasi = scan.nextInt();
                    lagi = true;
                    while (lagi) {
                        showMakanan();
                        System.out.println("Silakan Pilih Nomor Makanan");
                        pilihMakan = scan.nextInt();
                        if (pilihMakan == 0) {
                            makanan = false;
                            lagi = false;
                        } else {
                            makanan = true;
                        }
                    }
                    harga = controller.hitungBiayaTiket(jarak, bagasi, makanan);
                    tiket.add(new Bisnis(jarak, bagasi, harga, harga / 10));
                    break;

                case 3: // First
                    System.out.println("Silakan Masukkan nominal jarak : ");
                    jarak = scan.nextInt();
                    System.out.println("Silakan Memilih Makanan : ");
                    lagi = true;
                    while (lagi) {
                        System.out.println("Silakan Pilih Nomor Makanan");
                        System.out.println("1. Nanas \n2. Apel \n0. Exit");
                        pilihMakan = scan.nextInt();
                        if (lagi == false) {
                            break;
                        }
                        System.out.println("Masih Mau nambah?");
                        pilihMakan = scan.nextInt();
                        if (pilihMakan == 0) {
                            lagi = false;
                        }
                    }
                    harga = controller.hitungBiayaTiket(jarak);
                    tiket.add(new FirstClass(jarak, bagasi, harga, harga / 10));
                    break;
                default:
                    break;
            }
            Tiket receipt = tiket.get(index);

            System.out.println("Receipt ");
            System.out.println("---------");

            System.out.println("Total Harga Adalah :" + receipt.getHarga());
            System.out.println("Bagasi Kamu adalah :" + receipt.getBagasi());
            System.out.println("Jarak Tempuh adalah " + receipt.getJarakTempuh());

            System.out.println("Masih mau pesan lagi ?");
            repeat = scan.nextBoolean();
            index++;
        }
        System.out.println("Terima Kasih Sudah Berkunjung !");
    }

}
