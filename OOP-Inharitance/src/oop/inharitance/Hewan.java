/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inharitance;

/**
 *
 * @author mario
 */
public class Hewan {
    
    String jenis;
    String suara;
    
    Hewan(String jenis, String suara) {
        this.jenis = jenis;
        this.suara = suara;
    }
    
    void info() {
        System.out.println("\nJenis hewan : " + jenis);
        System.out.println("Suara       : " + suara);
    }
}
