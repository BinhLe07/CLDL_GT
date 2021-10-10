package Tuan01;

import java.util.Scanner;

public class Lab1Bai2
{
    public static void main(String[] args) 
    {
        Scanner Nhap = new Scanner(System.in);
        double DienTich,ChuVi,ChieuDai,ChieuRong;

        System.out.println("Nhap chieu dai: ");
        ChieuDai = Nhap.nextDouble();
        System.out.println("Nhap chieu rong: ");   
        ChieuRong = Nhap.nextDouble(); 

        ChuVi = (ChieuDai + ChieuRong)*2;
        DienTich = ChieuDai * ChieuRong;

        System.out.print("Chu Vi = "+ ChuVi);
        System.out.print("\nDien Tich = "+ DienTich);        
    }    
}
