package QuanLyBanHang;

public class MatHangMua extends MatHang{
    private HoaDon hd;
    private String matHangMuaID; //đổi sang String để có thể phân biệt với ID của những class khác
    private MatHang mh;
    private int soLuongMua;

    public MatHangMua(int soLuongMua, HoaDon hd, MatHang mh){
        super(mh.getGia(),mh.getSoLuongKho(),mh.getTenMatHang());
        this.soLuongMua = soLuongMua;
        this.matHangMuaID = mh.getMatHangID();
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
