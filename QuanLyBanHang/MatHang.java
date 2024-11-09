package QuanLyBanHang;

import java.util.ArrayList;

public class MatHang {
    private ArrayList<MatHang> mathang;
    private float gia;
    private String matHangID; //đổi sang String để có thể phân biệt với ID của những class khác
    private int soLuong;
    private String tenMatHang;
    private static int stt = 1;

    public MatHang(float gia, int soLuong, String tenMatHang) {
        this.gia = gia;
        this.matHangID = String.format("MH%02d", stt++);
        this.soLuong = soLuong;
        this.tenMatHang = tenMatHang;
        this.mathang = new ArrayList<MatHang>();
    }

    public void ThemMatHangVaoKho(){
        mathang.add(new MatHang(gia, soLuong, tenMatHang));
    }
}
