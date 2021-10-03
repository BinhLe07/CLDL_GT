package Tuan02;

import java.util.Scanner;

public class Lab1Bai1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String HoTen;
        double DiemTB;

        System.out.println("Nhập họ tên: ");
        HoTen = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: "); 
        DiemTB = scanner.nextDouble();

        System.out.printf("Họ tên: %s \n", HoTen);
        System.out.print("Điểm trung bình = "+ DiemTB);     
    }    
}