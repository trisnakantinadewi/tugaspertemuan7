/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert701;

/**
 *
 * @author trisnakantina 20103001
 */
public class Mahasiswa {
    private String nim,nama;
    
    public void datamhs () {
     System.out.println("--------Menampilkan Data Mahaiswa--------");
    }
    public void datamhs (String N) {
        this.nim = N;
        System.out.println("DATA MAHASISWA");
        System.out.println("NIM : "+this.nim);
    }
    public void datamhs (String N1,String N2) {
        this.nim = N1;
        this.nama = N2;
        System.out.println("DATA MAHASISWA");
        System.out.println("NIM  : "+this.nim);
        System.out.println("NAMA : "+this.nama);
    }
    
}
