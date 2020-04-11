/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author HP
 */
public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;
    
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }
    
    public String getThongTin(){        
        return String.format("Ten %s\n"
                + "Tuoi %d\n"
                + "DiaChi %s\n"
                + "tienLuong %f\n"
                + "tongSoGioLam %d\n"
                + "TinhThuong %f",ten,tuoi,diaChi,tienLuong,tongSoGioLam,tinhThuong());
    }
    
    public double tinhThuong(){
        if(tongSoGioLam >= 200)
            return tienLuong*20/100;
        else if(tongSoGioLam < 200 && tongSoGioLam >= 100)
            return tienLuong*10/100;
        else
            return 0;
    }
}
