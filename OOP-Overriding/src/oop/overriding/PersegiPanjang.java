/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.overriding;

/**
 *
 * @author mario
 */
public class PersegiPanjang extends Shape {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitung() {
        System.out.print("Menghitung luas Persegi panjang : ");
        return panjang * lebar;
    }
}
