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
                    Kucing kucing = new Kucing("Kucing", "Meow meow", 4);
                    kucing.info();
                    kucing.infoKucing();
                    break;
                case 2:
                    Anjing anjing = new Anjing("Anjing", "Guk guk guk", 4);
                    anjing.info();
                    anjing.infoAnjing();
                    break;
                case 3:
                    Sapi sapi = new Sapi("Sapi", "Mooo mooo", 4);
                    sapi.info();
                    sapi.infoSapi();
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
