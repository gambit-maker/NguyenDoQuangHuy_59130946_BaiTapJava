/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> danhSachXe = new ArrayList<>();
    
    public void themChuyenXe(ChuyenXe xe){
        danhSachXe.add(xe);
    }
    
    public void inDS(){
        int k = 1;
        for(ChuyenXe i : danhSachXe){
            System.out.println("Thong tin xe thu "+k);
            i.getThongTinXe();
            k++;
            System.out.println();
        }
    }
    
    public double tinhDoanhThuNoiThanh(){
        double tong = 0;
        for(ChuyenXe i:danhSachXe){
            if(i instanceof XeNoiThanh){
                tong += ((XeNoiThanh) i).doanhThu;
            }
        }
        return tong;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double tong = 0;
        for(ChuyenXe i:danhSachXe){
            if(i instanceof XeNgoaiThanh){
                tong += ((XeNgoaiThanh) i).doanhThu;
            }
        }
        return tong;
    }
}
