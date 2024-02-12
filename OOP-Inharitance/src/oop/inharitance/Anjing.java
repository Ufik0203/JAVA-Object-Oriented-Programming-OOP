/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inharitance;

/**
 *
 * @author mario
 */
public class Anjing extends Hewan {
    int jumlahKaki;

    public Anjing (String jenis, String suara,int jumlahKaki) {
        super(jenis, suara);
        this.jumlahKaki = jumlahKaki;
    }
    
    void infoAnjing() {
        System.out.println("Jumlah kaki : " + jumlahKaki);
    }
}
