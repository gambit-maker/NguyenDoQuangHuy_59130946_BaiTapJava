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
public class SinhVienIt extends SinhVienPoLy {
    double diemJava;
    double diemCss;
    double diemHtml;
    
    public SinhVienIt(String ten,String nganhHoc, double diemJava, double diemCss, double diemHtml){
        nganh = nganhHoc;
        hoTen = ten;
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    @Override
    public double getDiem() {
        return (2* diemJava + diemHtml +diemCss)/4;
    }
    
}
