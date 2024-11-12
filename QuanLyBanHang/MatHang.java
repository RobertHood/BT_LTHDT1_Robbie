package QuanLyBanHang;

import java.util.ArrayList;

public class MatHang {
    private static ArrayList<MatHang> mathang = new ArrayList<>(); //dùng arraylist tượng trưng kho hàng
    private float gia;
    private String matHangID; //đổi sang String để có thể phân biệt với ID của những class khác
    private int soLuongKho;
    private String tenMatHang;
    private static int stt = 1;

    public MatHang(float gia, int soLuongKho, String tenMatHang) {
        this.gia = gia;
        this.matHangID = String.format("MH%02d", stt++);
        this.soLuongKho = soLuongKho;
        this.tenMatHang = tenMatHang;
    }

    public void ThemMatHangVaoKho(){
        mathang.add(this);
    }
    public static void printMathang() {
        for (MatHang mh : mathang) {
            System.out.println("ID: " + mh.matHangID + ", Tên: " + mh.tenMatHang + ", Giá: " + mh.gia + ", Số lượng: " + mh.soLuongKho); }
    }
    public String getMatHangID(){
        return matHangID;
    }
    public float getGia(){
        return gia;
    }
    @Override
    public String toString() {
        return tenMatHang;
    }
}
