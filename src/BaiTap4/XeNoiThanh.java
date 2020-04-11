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
public class XeNoiThanh extends ChuyenXe {
    int soTuyen;
    int soKmDiDuoc;
    
    public XeNoiThanh(String maSoChuyen,
            String hoTen,
            String soXe,
            double doanhThu,
            int soTuyen,
            int soKmDiDuoc){        
        this.maSoChuyen = maSoChuyen;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }


    @Override
    public void getThongTinXe() {
          System.out.println(String.format("Ten %s\n"
                + "So Xe %s\n"
                + "Doanh Thu %f\n"
                + "So Tuyen %d\n"
                + "So Km %d",hoTen,soXe,doanhThu,soTuyen,soKmDiDuoc));
    }
}
