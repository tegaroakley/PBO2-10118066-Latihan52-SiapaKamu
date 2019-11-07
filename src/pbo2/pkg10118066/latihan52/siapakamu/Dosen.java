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
public class Dosen extends Manusia{
    private String nip, matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    public void mengajarApa(){
        setNama("Rizki Adam Kurniawan");
        setUmur(27);
        setMatakuliah("PBO");
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang mengajar matakuliah " + getMatakuliah());
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
}
