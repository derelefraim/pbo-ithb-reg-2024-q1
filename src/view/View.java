package view;
import java.util.Scanner;
import controller.*;
import view.*;
import model.*;
import java.util.List;


public class View {
    static Controller controller;
    static Scanner scan = new Scanner(System.in);

    public static void showMakanan(){
        System.out.println("1: Gulai");
        System.out.println("2: Rendang");
        System.out.println("3: Nasi Goreng");
        System.out.println("4: Croissant");
        System.out.println("5: Pempek Kapal Selam Langsung Dari Palembang BUSET");
        System.out.println("0: Ga dulu Mas");
    }

    public static void menuAwal(){
        System.out.println("Selamat Datang, Silakan Memilih Tipe tiket (1-3)");
        System.out.println("1. Ekonomi \n2. Bisnis \n3. First Class");
        int pilih = scan.nextInt();
        int bagasi = 0;
        int jarak = 0;
        boolean makanan = false;
        int pilihMakan;
        boolean lagi;
        switch (pilih) {
            case 1:
                System.out.println("Silakan Masukkan nominal jarak : ");
                jarak = scan.nextInt();
                System.out.println("Silakan Masukkan nominal berat bagasi : ");
                bagasi = scan.nextInt();
                controller.hitungBiayaTiket(jarak, bagasi);
                break;
        
            case 2:
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
                    }else{
                        makanan = true;
                    }
                }
                controller.hitungBiayaTiket(jarak,bagasi,makanan);
                break;
        
            case 3:
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
                controller.hitungBiayaTiket(jarak);
                break;
            default:
                break;
        }
    }   
}
