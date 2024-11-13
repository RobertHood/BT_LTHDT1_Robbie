package QuanLyBanHang;

public class MatHangMua{
    private HoaDon hd;
    private String matHangMuaID; //đổi sang String để có thể phân biệt với ID của những class khác
    private MatHang mh;
    private int soLuongMua;

    public MatHangMua(int soLuongMua, String matHangMuaID, HoaDon hd, MatHang mh){
        this.soLuongMua = soLuongMua;
        this.matHangMuaID = matHangMuaID;
        this.hd = hd;
        this.mh = mh;
    }

    public void ThemMatHangMuaCuaHoaDon(MatHangMua mhm, MatHang mh){
        hd.ThemHoaDon(this,mh);
    }
    public int getSoLuongMua(){
        return soLuongMua;
    }

    @Override
    public String toString(){
        return "Số lượng: " + soLuongMua + " | ID mặt hàng: " + matHangMuaID + " | HoaDon: " + hd + " | Tên mặt hàng: " + mh;
    }
}
