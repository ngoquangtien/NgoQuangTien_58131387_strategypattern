/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.SimpleDateFormat;

/**
 *
 * @author quang
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        QLSV dsSinhVien = new QLSV();
        SinhVien sv1 = new SinhVien("Do Hoang Nhat Duy", new SimpleDateFormat("dd/MM/yyyy").parse("05/08/1999"), 7);
        SinhVien sv2 = new SinhVien("Le The Dung", new SimpleDateFormat("dd/MM/yyyy").parse("12/11/1998"), 10);
        SinhVien sv3 = new SinhVien("Truong Hoang Khoa", new SimpleDateFormat("dd/MM/yyyy").parse("24/04/1999"), 6);
        
        dsSinhVien.them(sv1);
        dsSinhVien.them(sv2);
        dsSinhVien.them(sv3);
        System.out.println("Danh sach sinh vien luc dau->");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh((ISoSanh) new SoSanhTheoTen());
        dsSinhVien.sapXep();
        System.out.println("Danh sach sinh vien so sanh theo ten->");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh((ISoSanh) new SoSanhTheoDien());
        dsSinhVien.sapXep();
        System.out.println("Danh sach sinh vien so sanh theo diem->");
        dsSinhVien.inDS();
    }
    
}
