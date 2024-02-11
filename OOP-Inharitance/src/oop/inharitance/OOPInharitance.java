/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.inharitance;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class OOPInharitance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Scanner scan = new Scanner(System.in);
        int a;
        boolean valid = true;
        do {
            System.out.println("\nIngin tahu suara apa ? ");
            System.out.println("1. kucing");
            System.out.println("2. Anjing");
            System.out.println("3. Sapi");
            System.out.println("4. Keluar(Exit)");
            System.out.print("Masukkan pilihan : ");
            a = scan.nextInt();

            switch (a) {
                case 1:
                    System.out.println(hewan.kucing);
                    break;
                case 2:
                    System.out.println(hewan.anjing);
                    break;
                case 3:
                    System.out.println(hewan.sapi);
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    valid = false;
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        } while (valid);
        
    }
    
}
