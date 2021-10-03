package Tuan02;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {

        Scanner Nhap = new Scanner(System.in);

        double Canh,TheTich;
        System.out.println("Nhập cạnh: ");
        Canh=Nhap.nextDouble();
        
        TheTich=(Canh*Canh*Canh);

        System.out.println("Thể tích khối lập phương là: "+TheTich);

    
    }
}
