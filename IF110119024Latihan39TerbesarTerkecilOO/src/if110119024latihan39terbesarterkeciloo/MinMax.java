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
 */
public class MinMax {
    Scanner sc = new Scanner(System .in);
    public String petugas;
    public int jumlahNilaiMahasiswa;
    public int[] nilai;
    public int max = 0;
    public int min = 0;
    
    public void inputPetugas () {
        System.out.print("Masukan nama petugas\t : ");
        petugas = sc.nextLine();
    }
    
    public void inputMahasiswa () {
        System.out.print("Masukan banyaknya nilai mahasiswa\t : ");
        jumlahNilaiMahasiswa = sc.nextInt();
        
        nilai = new int [jumlahNilaiMahasiswa];
        
        for (int i = 0 ; i < jumlahNilaiMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " = ");
            nilai[i] = sc.nextInt();
        }
    }
    
    public void cekNilai () {
        min = nilai [0];
        for (int i = 0; i < jumlahNilaiMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " = " + nilai[i]);
            
            if (nilai[i] > max) {
                max = nilai[i];
            }else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
    public void kecilBesar () {
        cekNilai();
        System.out.println("Nilai Terbesar adalah\t" + max);
        System.out.println("Nilai Terkecil adalah\t" + min);
    }
}
