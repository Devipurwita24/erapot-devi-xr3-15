/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overide;

import java.util.Scanner;

/**
 *
 * @author devi
 */
public class inputan {

    public void data() {
        Scanner b = new Scanner(System.in);
        int jumlah;
        String[] nama = new String[6];
        String[] mapel = new String[6];
        int[] nilai = new int[6];
        String []pre= new String[6];

        System.out.print("\nmasukkan jumlah siswa (1-5): ");
        jumlah = b.nextInt();
        System.out.println("\n___________________________");
        System.out.println("| isilah data siswa berikut |");
        System.out.println("|___________________________|\n");

        for (int c = 1; c <= jumlah; c++) {
            System.out.print("Nama siswa "+c+"   : " );
            nama[c] = b.next();
        }
        System.out.println("");
        for (int d = 1; d <= jumlah; d++) {
            System.out.print("Mata pelajaran "+nama[d]+" : ");
            mapel[d] = b.next();
        }
        System.out.println("");
        for (int e = 1; e <= jumlah; e++) {
            System.out.print("Nilai "+mapel[e]+" "+nama[e]+" : ");
            nilai[e] = b.nextInt();
        }
        System.out.println("");
        for (int f = 1;f<=jumlah;f++){
            if (nilai[f] <= 100 && nilai[f] >= 95) {
                pre[f] = "A";
            } else if (nilai[f] <= 94 && nilai[f] >= 85) {
                pre[f] = "B";
            } else if (nilai[f] <= 84 && nilai[f] >= 75) {
                pre[f] = "C";
            } else {
                pre[f] = "D";
            }
    }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\t\t\tHASIL RAPOR");
        System.out.println("\n|\tnama\t|\tmapel\t|\tnilai\t|  predikat\t|\t");
        for (int j = 1; j <= jumlah; j++) {
            System.out.println("|\t"+ nama[j] + "\t|\t" + mapel[j] + "\t|\t" + nilai[j] + "\t|\t"+pre[j]+ "\t|\t");
        }
        System.out.print("");
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

    }

    public static void main(String[] args) {
        inputan devi = new inputan();
        devi.data();
    }
}
