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
public class sub1 extends Overide {

    public String halo;

    @Override
    public void data() {
        System.out.println("\n\t\t----------SELAMAT DATANG DI PENGISIAN DATA ERAPOT------------");
        System.out.println("\n__________________________________________________________________________________");
        System.out.println("\nselamat datang di Erapot .disini kita menyediakan jasa membuat rapot online");
        System.out.println("anda bisa mengisikan jumlah siswa yang ingin di data dan mengisi form lainya");
        System.out.println("");
    }

    public void data(String garis) {

    }

    public void halo(String halo) {
        this.halo = halo;

    }

}
