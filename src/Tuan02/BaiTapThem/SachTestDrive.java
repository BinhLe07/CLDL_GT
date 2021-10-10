package Tuan02.BaiTapThem;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        sach.nhaXuatBan = "ABC";
        System.out.println("Nhà xuất bản: " +sach.nhaXuatBan);
        
        System.out.println();

        sach = new Sach("ABC", 2021, 100, "Tạp chí", 10, 13);
        sach.inThongTin();

    }
    
}
