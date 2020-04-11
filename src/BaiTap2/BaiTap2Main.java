/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
/**
 *
 * @author HP
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien quanLy = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Nguyen Van A", 30, "2 Hai Ba Trung", 13000000, 300);
        NhanVien nv2 = new NhanVien("Tran Thi B", 26, "10 Hai Ba Trieu", 16000000, 400);
        NhanVien nv3 = new NhanVien("Do Van C", 27, "20 Dinh Tien Hoan", 21000000, 100);
        NhanVien nv4 = new NhanVien("Dinh Van D", 31, "11 Cao Ba Quat", 9000000, 90);
        NhanVien nv5 = new NhanVien("Bui Minh E", 25, "10 Biet Thu", 10000000, 150);
        
        quanLy.them(nv1);
        quanLy.them(nv2);
        quanLy.them(nv3);
        quanLy.them(nv4);
        quanLy.them(nv5);
        
        quanLy.inDS();
    }
    
}
