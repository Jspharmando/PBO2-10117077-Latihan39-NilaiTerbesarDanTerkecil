package com.company;

/**
 * @author
 * Nama : Joseph Aramando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Petugas ptg = new Petugas();
            DaftarNilai dafNilai = new DaftarNilai();
            Scanner scn = new Scanner(System.in);

            System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
            ptg.inputPetugas();
            dafNilai.inputJumlahMhs();

            //input nilai mhs//
            for (int i=0; i<dafNilai.jumlahMhs; i++) {
                System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "\t: ");
                dafNilai.nilaiMhs[i] = scn.nextInt();
                dafNilai.hitungNilaiTerbesar(i);
                dafNilai.hitungNilaiTerkecil(i);
            }
            dafNilai.hasilNilaiMhs();

            System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
            System.out.println("Nilai Terkecil adalah "+dafNilai.nKecil);

            System.out.print("\nPetugas : "+ptg.namaPetugas);
        }
}
