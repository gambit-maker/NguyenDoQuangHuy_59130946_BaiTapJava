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
public abstract class SinhVienPoLy {
    String hoTen;
    String nganh;
    
    public abstract double getDiem();       
    public void xuat(){
        System.out.println(String.format("HoTen %s\nNganh %s",hoTen,nganh));
    }
    public String getHocLuc(){
        if(getDiem() < 5)
            return "Yeu";
        else if(getDiem() >= 5 && getDiem() < 6.5)
            return "Trung Binh";
        else if(getDiem() >= 6.5 && getDiem() < 7.5)
            return "Kha";
        else if(getDiem() >= 7.5 && getDiem() <9)
            return "Gioi";
        else return "Xuat Xac";
    }
}
