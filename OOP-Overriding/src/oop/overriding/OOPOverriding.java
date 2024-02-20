/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.overriding;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class OOPOverriding {

    /**
     * @param args the command line arguments
     */
    
    private void lingkaran() {
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.print("\nMasukkan jari-jari lingkaran : ");
        a = scan.nextDouble();
        
        Lingkaran o = new Lingkaran(a);
        double luasL = o.hitung();
        System.out.println(luasL);
    }
    
    private void persegipanjang() {
        Scanner scan = new Scanner(System.in);
        double a,b;
        System.out.print("\nMasukkan PANJANG Perse Panjang : ");
        a = scan.nextDouble();
        System.out.print("Masukkan LUAS Perse Panjang : ");
        b = scan.nextDouble();
        
        PersegiPanjang p = new PersegiPanjang(a, b);
        double luasP = p.hitung();
        System.out.println(luasP);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        OOPOverriding obj = new OOPOverriding();
        boolean valid = true;
        do {
            System.out.println("\n1. Hitung luas lingkaran");
            System.out.println("2. Hitung luas persegi panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkkan pilihan : ");
            a = scan.nextInt();
            
            switch(a) {
                case 1:
                    obj.lingkaran();
                    break;
                case 2:
                    obj.persegipanjang();
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    valid = false;
                default:
                    System.out.println("Inputan tidak valid!");
                    break;
            }
            
        } while (valid);
    }
    
}
