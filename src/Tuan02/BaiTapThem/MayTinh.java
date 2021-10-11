package Tuan02.BaiTapThem;

public class MayTinh {
    String nhaSanXuat;
    int NamSanXuat;
    String HeDieuHanh;
    String RAM;
    String CPU;
    double Gia;
    int NamBaoHanh;

    MayTinh(){
        //Hàm tạo mặc định
    }

    MayTinh(String NSX, int nam, String HDH, String r, String c, double g, int NBH){
        nhaSanXuat = NSX;
        NamSanXuat = nam;
        HeDieuHanh = HDH;
        RAM = r;
        CPU = c;
        Gia = g;
        NamBaoHanh = NBH;
    }

    void inThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.printf("Năm sản xuất: "+NamSanXuat);
        System.out.println("\nHệ điều hành: "+HeDieuHanh);
        System.out.println("RAM: "+RAM);
        System.out.println("CPU: "+CPU);
        System.out.println("Giá bán: "+Gia+"Đồng");
        System.out.println("Năm bảo hành: "+NamBaoHanh);
    }
}
