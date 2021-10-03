package Tuan02;

import java.util.Scanner;

public class Lab1Bai1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String HoTen;
        double DiemTB;

        System.out.println("Nhap Vao Ho Va Ten: ");
        HoTen = scanner.nextLine();
        System.out.println("Nhap Vao Diem Trung Binh: "); 
        DiemTB = scanner.nextDouble();

        System.out.printf("Ho Va Ten: %s \n", HoTen);
        System.out.print("Diem Trung Binh = "+ DiemTB);     
    }    
}