package QuanLyBanHang;

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

        HoaDon hoadonA = new HoaDon("12/11/2024",khachhangA);

        MatHangMua mhmX = new MatHangMua(20, mathangX.getMatHangID(), hoadonA, mathangX);
        MatHangMua mhmY = new MatHangMua(20, mathangY.getMatHangID(), hoadonA, mathangY);

        mhmX.ThemMatHangMuaCuaHoaDon(mhmX,mathangX);
        mhmY.ThemMatHangMuaCuaHoaDon(mhmY,mathangY);

        //In ra thông tin hóa đơn cùng các mặt hàng mà Nguyễn Văn A đã mua
        System.out.println("Hóa đơn của Nguyễn Văn A:");
        hoadonA.InHoaDon();
        System.out.println("Các mặt hàng mà Nguyễn Văn A mua:");
        hoadonA.InMatHangTrongHoaDon();
    }
}
