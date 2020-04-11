/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author HP
 */
public class SinhVienBiz extends SinhVienPoLy {
    double diemMarketing;
    double diemSales;
    
    public SinhVienBiz(String ten,String nganhHoc,double diemMarketing, double diemSales){
        hoTen = ten;
        nganh = nganhHoc;
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem() {
        return (2* diemMarketing + diemSales)/3;
    }
    
}
