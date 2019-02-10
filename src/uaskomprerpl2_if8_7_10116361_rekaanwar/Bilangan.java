/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaskomprerpl2_if8_7_10116361_rekaanwar;

/**
 *
 * @author RSA
 * HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 7

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN

 */
public class Bilangan {

    private int nilai1,nilai2,jumlahkan,kurangkan;
    public void setNilai1(int nilai1){
        this.nilai1 = nilai1;
    }

    public void setNilai2(int nilai2){
        this.nilai2 = nilai2;
    }
    public void setjumlahkan(int jumalahkan){
        jumlahkan= nilai1 + nilai2;
        this.jumlahkan = jumlahkan;
    }
    public void setkurangkan(int kurangkan){
        kurangkan= nilai1 - nilai2;
        this.kurangkan = kurangkan;
    }

    // ini method getter
    public int getNilai1(){
        return this.nilai1;
    }

    public int getNilai2(){
        return this.nilai2;
    }
    public int getJumlahkan(){
        jumlahkan = nilai1 + nilai2;
        return this.jumlahkan;
    }
    public int getKurangkan(){
        kurangkan = nilai1 - nilai2;
        return this.kurangkan;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bilangan reka = new Bilangan();
        int Nilai1,Nilai2,jumlahkan,kurangkan;
        reka.setNilai1(3);
        reka.setNilai2(4);
        System.out.println("Hasil Penjumlahan = "+ reka.getJumlahkan());
        System.out.println("Hasil Pengurangan = "+ reka.getKurangkan());
    }
    
}
