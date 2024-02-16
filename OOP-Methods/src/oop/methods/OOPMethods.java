/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.methods;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class OOPMethods {

    /**
     * @param args the command line arguments
     */
    
    private static void mtds (int a, int b) {   // static methods can be live call
        System.out.println("Hasilnya adalah " + (a+b));
    }
    
    private void mtd() {    // non-static methods need initiate to be call
        System.out.println("\n===== non-static ======");
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Masukkan angka ke-1 : ");
        a = scan.nextInt();
        System.out.println("Masukkan angka ke-2 : ");
        b = scan.nextInt();
        System.out.println("Hasil kalinya adalah " + (a*b));
    }
    
    public static void main(String[] args) {
        OOPMethods obj = new OOPMethods();
        System.out.println("====== static =======");
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Masukkan angka ke-1 : ");
        a = scan.nextInt();
        System.out.println("Masukkan angka ke-2 : ");
        b = scan.nextInt();
        mtds(a, b);
        obj.mtd();
    }
    
}
