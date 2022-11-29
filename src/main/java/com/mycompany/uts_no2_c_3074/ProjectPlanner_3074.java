/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
public class ProjectPlanner_3074 extends Pegawai_3074{
    private int gajiPokok_3074, komisi_3074, totalHasilProyek_3074;

    public ProjectPlanner_3074(String nama, String nip, int gajiPokok, int komisi, int totalHasilProyek) {
        super(nama, nip);
        this.gajiPokok_3074=gajiPokok;
        this.komisi_3074=komisi;
        this.totalHasilProyek_3074=totalHasilProyek;
    }
    @Override
    public int HitungGajiAkhir_3074(){
        float pajak = (float) (gajiPokok_3074*0.05);
        return (int)(gajiPokok_3074 + ((komisi_3074 * totalHasilProyek_3074) - pajak));
    }
     public void cetakProjectPlanner_3074(){
        System.out.println("PROJECT PLANNER");
        super.cetakPegawai_3074();
        System.out.println("Gaji Pokok          : Rp " +gajiPokok_3074);
        System.out.println("Komisi              : Rp " +komisi_3074);
        System.out.println("Total Hasil Proyek  : "+totalHasilProyek_3074);
        System.out.println("Total Gaji          : Rp "+HitungGajiAkhir_3074());
    }
    
    
}
