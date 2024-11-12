package QuanLyBanHang;

import java.util.ArrayList;

public class HoaDon {
    private String HoaDonID; //đổi sang String để có thể phân biệt với ID của những class khác
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> MatHangMuaList;
    private static int stt = 1;

    public HoaDon(String ngayBan, KhachHang kh) {
        this.HoaDonID = String.format("HD%02d", stt++);
        this.ngayBan = ngayBan;
        this.tongTien = 0;
        this.MatHangMuaList = new ArrayList<>();
        this.kh = kh;
    }
    public void InHoaDon(){
        System.out.println("ID Hóa đơn: " + HoaDonID + " | Ngày Bán: " + ngayBan + " | Tổng tiền: " + tongTien + " | Khách hàng: " + kh);
    }
    public void ThemHoaDon(MatHangMua matHangMua, MatHang mh){
        MatHangMuaList.add(matHangMua);
        this.tongTien += matHangMua.getSoLuongMua() * mh.getGia();
    }
    public void InMatHangTrongHoaDon(){
        for(MatHangMua mh : MatHangMuaList){
            System.out.println(mh);
        }
    }
    @Override
    public String toString() {
        return HoaDonID;
    }
}

