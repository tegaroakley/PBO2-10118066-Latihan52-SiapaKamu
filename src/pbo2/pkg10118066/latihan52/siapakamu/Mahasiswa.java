/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan52.siapakamu;

/**
 *
 * @author PC
 */
public class Mahasiswa extends Manusia{
    private String nim, kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        setNama("Tegar Lucky Oakley");
        setUmur(18);
        setKelas("PBO2");
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang belajar di kelas " + getKelas());
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    
}
