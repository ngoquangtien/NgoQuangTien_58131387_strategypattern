/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author quang
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang g1 = new GioHang();
        GioHang g2 = new GioHang();
        
        g1.setHinhTHucTT(new ThanhToanCOD());
        g2.setHinhTHucTT(new ThanhToanOnline());
        
        HangHoa hh2 = new HangHoa("Bo chen su", 450000, "Bo chen su voi hoa van dep");
        HangHoa hh3 = new HangHoa("Tivi", 2000000, "Tivi led mau");
        HangHoa hh4 = new HangHoa("May loc nuoc", 1200000, "May loc nuoc hieu qua");
        
        System.out.println("Gio hang 1");
        g1.them(hh4);
        g1.inDS();
        System.out.println("\nTong tien hang: " + g1.TinhTIenHang()+ "\nTien khach hang tra: " + g1.tinhTienTra());
        
        System.out.println("Gio hang 2");
        g2.them(hh2);
        g2.them(hh4);
        g2.them(hh3);
        g2.inDS();
        System.out.println("\nTong tien hang: " + g2.TinhTIenHang() + "\nTien khach hang tra: " + g2.tinhTienTra());
    }
    
}
