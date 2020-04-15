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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang<1000000)
            tienHang -= tienHang*0.5;
        else
            tienHang -= tienHang*0.7;
        return tienHang;
    }
    
}
