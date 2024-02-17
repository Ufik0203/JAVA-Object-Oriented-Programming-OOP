/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.overloading;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class OOPOverloading {

    /**
     * @param args the command line arguments
     */
    
    private static void kta(String a, String b, String c){
        System.out.println("Hasil penyusunan kata : " + a + " " + b + " " + c);
        
        // can be implement with more logic base on programs
    }
    
    private void field() {
        Scanner scan = new Scanner(System.in);
        String a,b,c;
        
        System.out.print("Masukkan kata ke 1 : ");
        a = scan.nextLine();
        System.out.print("Masukkan kata ke 2 : ");
        b = scan.nextLine();
        System.out.print("Masukkan kata ke 3 : ");
        c = scan.nextLine();
        
        kta(a, b, c);
    }
    
    public static void main(String[] args) {
        OOPOverloading obj = new OOPOverloading();
        obj.field();
    }
    
}
