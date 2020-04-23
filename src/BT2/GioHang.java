/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class GioHang extends HangHoa{
    
    
    IThanhToan hinhTHucTT;
    ArrayList<HangHoa> danhSachHH = new ArrayList<>();

    public GioHang() {
    }

    public void setHinhTHucTT(IThanhToan hinhTHucTT) {
        this.hinhTHucTT = hinhTHucTT;
    }
    public void them(HangHoa hh){
        danhSachHH.add(hh);
    }
    public int TinhTIenHang(){
        int s = 0;
        for(int i = 0; i < danhSachHH.size(); i++){
            s = s + danhSachHH.get(i).getGia();
        }
        return s;
    
    }
    public double tinhTienTra(){
        return hinhTHucTT.thanhToan(TinhTIenHang());
    }
    
    public void inDS(){
        for(int i = 0; i < danhSachHH.size(); i++){
            System.out.println("\n");
            danhSachHH.get(i).thongTinHangHoa();
        }
    
}
}
