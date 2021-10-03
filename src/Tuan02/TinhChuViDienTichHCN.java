package Tuan02;

import java.util.Scanner;

public class TinhChuViDienTichHCN {
    public static void main(String[] args) 
    {
        Scanner Nhap = new Scanner(System.in);
        double DienTich,ChuVi,ChieuDai,ChieuRong;

        System.out.println("Nhập chiều dài: ");
        ChieuDai = Nhap.nextDouble();
        System.out.println("Nhập chiều rộng: ");   
        ChieuRong = Nhap.nextDouble(); 

        ChuVi = (ChieuDai + ChieuRong)*2;
        DienTich = ChieuDai * ChieuRong;

        System.out.print("Chu Vi = "+ ChuVi);
        System.out.print("\nDien Tich = "+ DienTich);        
    }    
}
