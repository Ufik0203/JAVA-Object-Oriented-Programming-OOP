/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inharitance;

/**
 *
 * @author mario
 */
public class Sapi extends Hewan {
    int jumlahKaki;
    
    public Sapi(String jenis, String suara, int jumlahKaki) {
        super(jenis, suara);
        this.jumlahKaki = jumlahKaki;
    }
    
    void infoSapi() {
        System.out.println("Jumlah kaki : " + jumlahKaki);
    }
}
