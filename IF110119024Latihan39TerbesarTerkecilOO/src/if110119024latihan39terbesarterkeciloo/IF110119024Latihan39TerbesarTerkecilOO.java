/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan39terbesarterkeciloo;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA  : Kusnandi Pirmansyah
 * KELAS : IF-1
 * NIM   : 10119024
 */
public class IF110119024Latihan39TerbesarTerkecilOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinMax mx = new MinMax ();
        
        System.out.println("====Program Nilai Terbesar dan Terkecil====");
        mx.inputPetugas();
        mx.inputMahasiswa();
        
        System.out.println("====Hasil Nilai Mahaiswa====");
        mx.cekNilai();
        mx.kecilBesar();
        
    }
    
}
