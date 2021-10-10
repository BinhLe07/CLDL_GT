package Tuan02.BaiTapThem;

public class Xe {
    String TenChuXe;
    String HangSanXuat;
    String DongXe;
    String GiayPhep;
    double DungTichXang;

    Xe(){
        //Hàm tạo mặc định
    }
    Xe(String T,String HXS,String DX,String GP,double DTX){
        TenChuXe = T;
        HangSanXuat = HXS;
        DongXe = DX;
        GiayPhep = GP;
        DungTichXang = DTX;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: "+TenChuXe);
        System.out.println("Hãng sản xuất: "+HangSanXuat);
        System.out.println("Dòng: "+DongXe);
        System.out.println("Giấy phép: "+GiayPhep);
        System.out.printf("dung tích xăng: %.2f lít", DungTichXang);
    }
}
