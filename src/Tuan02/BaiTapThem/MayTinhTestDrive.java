package Tuan02.BaiTapThem;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh MayTinh;
        MayTinh = new MayTinh();

        MayTinh.nhaSanXuat = "HP";
        System.out.println("Nhà sản xuất: "+MayTinh.nhaSanXuat);

        System.out.println();

        MayTinh = new MayTinh("ASUS", 2018, "Windows 10", "8GB", "Intel core i3", 1500000, 1);
        MayTinh.inThongTin();
    }
}
