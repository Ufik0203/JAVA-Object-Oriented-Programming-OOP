/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.overriding;

/**
 *
 * @author mario
 */
public class Lingkaran extends Shape {
    private double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }
    
    @Override
    public double hitung() {
        System.out.print("Menghitung luas lingkaran : ");
        return Math.PI * r * r;
    }
}
