package QuanLyHoaDonBanHang;

import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<>();
    }

    public void add(Order ord) {
        orders.add(ord);
    }

    public void remove(Order ord) {
        orders.remove(ord);
    }

    public int getCount() {
        return orders.size();
    }

    public OrderIterator getOIterator() {
        return new OrderIterator(orders);
    }
}
