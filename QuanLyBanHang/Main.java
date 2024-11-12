package QuanLyBanHang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Thêm 3 mặt hàng X,Y,Z vào kho;
        MatHang mathangX = new MatHang(15000,100,"X");
        mathangX.ThemMatHangVaoKho();
        MatHang mathangY = new MatHang(20000,120,"Y");
        mathangY.ThemMatHangVaoKho();
        MatHang mathangZ = new MatHang(25000,150,"Z");
        mathangZ.ThemMatHangVaoKho();

        System.out.println("Kho hàng gồm có");
        MatHang.printMathang();

        //Thêm 1 hóa đơn cho khách hàng Nguyễn Văn A, biết rằng khách hàng này đã mua 2 mặt hàng tên X,Y
        KhachHang khachhangA = new KhachHang("Ha Noi","Nguyen Van A");
        HoaDon hoadonA = new HoaDon("12/11/2024", mathangX.getGia() + mathangY.getGia(), khachhangA);
        MatHangMua mhmX = new MatHangMua(20,mathangX.getMatHangID(),hoadonA,mathangX);
        
    }
}
