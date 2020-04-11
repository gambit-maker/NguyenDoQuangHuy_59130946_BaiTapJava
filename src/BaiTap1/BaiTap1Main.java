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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Nguyen Van A", 25, "155 Yearsin", 15000000, 300);
        NhanVien nv2 = new NhanVien("Nguyen Thi B", 24, "12 Bac Lieu", 13000000, 150);
        System.out.println("Nhan vien 1");
        System.out.println(nv1.getThongTin());
        System.out.println("Nhan vien 2");
        System.out.println(nv2.getThongTin());
        System.out.println("Hello World");
    }
    
}
