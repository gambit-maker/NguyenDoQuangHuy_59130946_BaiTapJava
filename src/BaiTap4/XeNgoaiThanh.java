/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author HP
 */
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;
    
    public XeNgoaiThanh(String maSoChuyen,
            String hoTen,
            String soXe,
            double doanhThu,
            String noiDen,
            int soNgayDi){
        this.maSoChuyen = maSoChuyen;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    
    @Override
    public void getThongTinXe() {
        System.out.println(String.format("Ten %s\n"
                + "So Xe %s\n"
                + "Doanh Thu %f\n"
                + "Noi Den %s\n"
                + "So Ngay Di %d",hoTen,soXe,doanhThu,noiDen,soNgayDi));
    }
    
    
    
}
