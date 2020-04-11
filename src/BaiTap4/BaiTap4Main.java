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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChuyenXe x1 = new XeNgoaiThanh("N01", "Nguyen Van A", "092831", 21000000, "HoChiMinh", 3);
        ChuyenXe x2 = new XeNgoaiThanh("N02", "Do Van B", "928812", 30000000, "HaNoi", 6);
        ChuyenXe x3 = new XeNgoaiThanh("N03", "Pham Van C", "774221", 10000000, "DakLak", 2);
        
        ChuyenXe x4 = new XeNoiThanh("M01", "Do Dong D", "A18219", 5000000, 23, 1828);
        ChuyenXe x5 = new XeNoiThanh("M02", "Truong Van E", "B12382", 1000000, 30, 5002);
        ChuyenXe x6 = new XeNoiThanh("M03", "Nguyen Van F", "C12882", 56200000, 2, 981);
        
        QuanLyChuyenXe quanLy = new QuanLyChuyenXe();
        
        quanLy.themChuyenXe(x1);
        quanLy.themChuyenXe(x2);
        quanLy.themChuyenXe(x3);
        
        quanLy.themChuyenXe(x4);
        quanLy.themChuyenXe(x5);
        quanLy.themChuyenXe(x6);
        
        System.out.println("In Danh Sach\n");
        quanLy.inDS();        
        
        System.out.println("Doanh Thu Ngoai Thanh "+quanLy.tinhDoanhThuNgoaiThanh());        
        System.out.println("Doanh Thu Noi Thanh "+quanLy.tinhDoanhThuNoiThanh());
        
        double tong = quanLy.tinhDoanhThuNoiThanh() + quanLy.tinhDoanhThuNgoaiThanh();
        System.out.println("Tong Doanh Thu "+tong);
        
        
    }
    
}
