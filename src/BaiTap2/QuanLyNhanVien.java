/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class QuanLyNhanVien implements IQuanLy {
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();

    @Override
    public void them(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        int k = 1;
        for(NhanVien i :danhSachNhanVien){
            System.out.println("Nhan Vien Thu "+k);
            System.out.println(i.getThongTin());            
            k++;
            System.out.println();
        }        
    }
    
    
}
