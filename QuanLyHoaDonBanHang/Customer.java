package QuanLyHoaDonBanHang;

public class Customer {
    private String address;
    private String code;
    private String name;
    private static int stt = 1;

    public Customer(String address, String code, String name) {
        this.address = address;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Code: " + code + ", Address: " + address;
    }
}
