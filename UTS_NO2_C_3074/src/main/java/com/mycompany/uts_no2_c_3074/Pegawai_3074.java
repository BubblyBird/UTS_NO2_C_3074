/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
public abstract class Pegawai_3074 {
    protected String nama_3074, nip_3074;
    protected int gaji_pokok_3074;
    
    public Pegawai_3074(String nama, String nip){
        this.nama_3074=nama;
        this.nip_3074 = nip;   
    }
    
    public int HitungGajiAkhir_3074(){
        return 0;
    }
    public void cetakPegawai_3074(){
        System.out.println("NIP                 : "+nip_3074);
        System.out.println("Nama                : "+nama_3074);
    }   
}
