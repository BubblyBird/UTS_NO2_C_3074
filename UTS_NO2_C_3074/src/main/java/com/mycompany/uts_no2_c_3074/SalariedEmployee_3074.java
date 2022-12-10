/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
public class SalariedEmployee_3074 extends Pegawai_3074{
    private int upahMingguan_3074;
    
    public SalariedEmployee_3074(String nama, String nip, int UpahMingguan){
        super(nama, nip);
        this.upahMingguan_3074=UpahMingguan;
    }
    @Override
    public int HitungGajiAkhir_3074(){
        return upahMingguan_3074;
    }
    public void cetakPegawai_3074(){
        System.out.println("SALARIED EMPLOYEE");
        super.cetakPegawai_3074();
        System.out.println("Gaji                : "+HitungGajiAkhir_3074());
    }
}
