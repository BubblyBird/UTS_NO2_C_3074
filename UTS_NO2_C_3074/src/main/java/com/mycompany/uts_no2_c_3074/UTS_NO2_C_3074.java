/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
public class UTS_NO2_C_3074 {

    public static void main(String[] args) {
        SalariedEmployee_3074 S = new SalariedEmployee_3074("Budi","0001",300000);
        CommissionEmployee_3074 C = new CommissionEmployee_3074("Dewi", "0002", 450000, 30000, 29 );
        ProjectPlanner_3074 P = new ProjectPlanner_3074("Dio", "0003", 500000, 35000, 12);
        
        System.out.println("\n\n==DISPLAY DATA PEGAWAI==\n");
        S.cetakPegawai_3074();
        System.out.println();
        C.cetakPegawai_3074();
        System.out.println();
        P.cetakPegawai_3074();
       
    }
}
