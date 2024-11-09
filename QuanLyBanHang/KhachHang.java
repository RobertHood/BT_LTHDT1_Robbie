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

    public String getDiachi() {
        return diachi;
    }
    public String getKhachHangID() {
        return khachHangID;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void setKhachHangID(String khachHangID) {
        this.khachHangID = khachHangID;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
