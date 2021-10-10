package Tuan03;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner DuLieu = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = DuLieu.nextInt();
        String ho_Ten[] = new String[n];
        double diem[] = new double[n];
        for(int i = 0;i < n;i++) {
            DuLieu.nextLine();
            System.out.printf("Họ và tên sinh viên thứ %d: ", i+1);
            ho_Ten[i] = DuLieu.nextLine();
            System.out.printf("Điểm sinh viên thứ %d: ", i+1);
            diem[i] = DuLieu.nextDouble();
        }
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n - 1;j++){
                if(diem[i] > diem[j]){
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;
                    String tam2 = ho_Ten[i];
                    ho_Ten[i] = ho_Ten[j];
                    ho_Ten[j] = tam2;
                }
            }
        }
        System.out.printf("------DANH SÁCH SINH VIÊN------");
        for(int i = 0;i < n;i++){
            System.out.printf("\nHọ và tên: %s\n", ho_Ten[i]);
            System.out.printf("Điểm: %.2f\n", diem[i]);
            if(diem[i] >= 9)
                System.out.println("Xếp loại: Xuất sắc");
            else{
                if(diem[i] >= 7.5)
                    System.out.println("Xếp loại: Giỏi");
                else{
                    if(diem[i] >= 6.5)
                        System.out.println("Xếp loại: Khá");
                    else{
                        if(diem[i] >= 5)
                            System.out.println("Xếp loại: Trung bình");
                        else    
                            System.out.println("Xếp loại: Yếu");
                    }
                }
            }
            System.out.print("_____________________________");
        }
    }
}
