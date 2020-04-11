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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienIt it = new SinhVienIt("Nguyen Van A","Cong Nghe Thong Tin",9.5,9.5,9.6);
        it.xuat();
        System.out.println("Diem "+it.getDiem());
        System.out.println("Hoc Luc "+it.getHocLuc());
        
        System.out.println();
        SinhVienBiz biz = new SinhVienBiz("Nguyen Van B", "Marketing", 5.6, 7.6);
        biz.xuat();
        System.out.println("Diem "+biz.getDiem());
        System.out.println("Hoc Luc "+biz.getHocLuc());
                
    }
    
}
