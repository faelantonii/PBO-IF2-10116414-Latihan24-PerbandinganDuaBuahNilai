/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan24_PerbandinganDuaBuahNilai;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Pebandingan Dua Buah Nilai
 */
public class PBO_IF2_10116414_PerbandinganDuaBuahNilai {
    public static void main(String[] args) {
        int nilaisatu ;
        int nilaidua;
        
        String hasil = null ;
        String Kembali;
        
        Scanner scan=new Scanner(System.in);
        
       do { 
        /*Inputan data*/
        System.out.print ("Masukan nilai pertama   : ");        
        nilaisatu = scan.nextInt();
        
        System.out.print ("Masukan nilai kedua : ");        
        nilaidua = scan.nextInt();       
        
         
        /*Pemilihan status dengan fungsi IF*/
        if (nilaisatu>nilaidua)
        {
            hasil = (nilaisatu + " lebih besar dari " + nilaidua);
        }
        else if (nilaisatu<nilaidua)
            {
                hasil = (nilaisatu + " lebih kecil dari " + nilaidua);
            }
        else if (nilaisatu==nilaidua)
            {
                hasil = (nilaisatu + " sama dengan " + nilaidua);
            }                 
        
            System.out.println("Hasil :" + hasil);
            System.out.print("Ulangi aktivitas diatas? (Ya/Tidak)\t : ");
            Kembali = scan.next();

        } while (Kembali.equals("Ya"));
         }
    
}
