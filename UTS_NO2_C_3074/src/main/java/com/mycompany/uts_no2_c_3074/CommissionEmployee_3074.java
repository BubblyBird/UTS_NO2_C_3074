/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
class CommissionEmployee_3074 extends Pegawai_3074{
    private int gajiPokok_3074, komisi_3074, totalPenjualan_3074;

    public CommissionEmployee_3074(String nama, String nip, int gajiPokok, int komisi, int totalPenjualan) {
        super(nama, nip);
        this.gajiPokok_3074=gajiPokok;
        this.komisi_3074=komisi;
        this.totalPenjualan_3074=totalPenjualan;
    }
    
    @Override
    public int HitungGajiAkhir_3074(){
     return gajiPokok_3074 + (komisi_3074 * totalPenjualan_3074);   
    }
    public void cetakPegawai_3074(){
        System.out.println("COMMISSION EMPLOYEE");
        super.cetakPegawai_3074();
        System.out.println("Gaji Pokok          : Rp " +gajiPokok_3074);
        System.out.println("Komisi              : Rp " +komisi_3074);
        System.out.println("Total Penjualan     : "+totalPenjualan_3074);
        System.out.println("Total Gaji          : Rp "+HitungGajiAkhir_3074());
    }
    
}
