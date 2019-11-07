/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan52.siapakamu;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen manusia1;
        Mahasiswa manusia2;
         manusia1 = new Dosen();
         manusia1.setNip("41227829930");
         System.out.println("NIP DOSEN : " + manusia1.getNip());
         manusia1.siapaKamu();
         manusia1.mengajarApa();
         System.out.println("");
         manusia2 = new Mahasiswa();
         manusia2.setNim("10118066");
         System.out.println("NIM MAHASISWA : " + manusia2.getNim());
         manusia2.siapaKamu();
         manusia2.kelasApa();
    }
    
}
