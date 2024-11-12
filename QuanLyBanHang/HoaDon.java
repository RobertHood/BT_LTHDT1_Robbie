package QuanLyBanHang;

import java.util.ArrayList;

public class HoaDon {
    private String HoaDonID; //đổi sang String để có thể phân biệt với ID của những class khác
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> MatHangMuaList;
    private static int stt = 1;

    public HoaDon(String ngayBan, float tongTien, KhachHang kh) {
        this.HoaDonID = String.format("HD%02d", stt++);
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
        this.MatHangMuaList = new ArrayList<>();
        this.kh = kh;
    }
    public void InHoaDon(){
        System.out.println("HoaDonID: " + HoaDonID + "| NgayBan: " + ngayBan + "| TongTien: " + tongTien + "| KhachHang: " + kh);
    }
    public void ThemHoaDon(MatHangMua matHangMua){
        MatHangMuaList.add(matHangMua);
    }

    public String getHoaDonID() {
        return HoaDonID;
    }
    public KhachHang getKh() {
        return kh;
    }
    public void setKh(KhachHang kh) {
        this.kh = kh;
    }
    public String getNgayBan() {
        return ngayBan;
    }
    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
    public float getTongTien() {
        return tongTien;
    }
    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

}

