package QuanLyBanHang;

public class MatHangMua{
    private HoaDon hd;
    private String matHangMuaID; //đổi sang String để có thể phân biệt với ID của những class khác
    private MatHang mh;
    private int soLuong;
    private static int stt = 1;

    public MatHangMua(int soLuong, String matHangMuaID, HoaDon hd, MatHang mh){
        this.matHangMuaID = matHangMuaID;
        this.soLuong = soLuong;
        this.hd = hd;
        this.mh = mh;
    }

    public void ThemMatHangMuaCuaHoaDon(MatHangMua mhm){
        hd.ThemHoaDon(this);
    }
}
