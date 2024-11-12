package QuanLyBanHang;

public class KhachHang {
    private String diachi;
    private String khachHangID; //đổi sang String để có thể phân biệt với ID của những class khác
    private String tenKH;
    private static int stt = 1;

    public KhachHang(String diachi, String tenKH) {
        this.diachi = diachi;
        this.khachHangID = String.format("KH%02d", stt++);
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "[ID Khách hàng: " + khachHangID + ",Tên Khách hàng: " + tenKH + ", Địa chỉ: " + diachi + "]";
    }
}
