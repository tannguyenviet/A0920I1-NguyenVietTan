package BaiTapAnhHai.BO;

import BaiTapAnhHai.Entity.Truck;

import java.io.IOException;
import java.util.List;

public interface B_Truck {
    List<Truck> getList() throws IOException;
    Truck getDetailTruck(int index) throws IOException;
    void Insert() throws IOException;
}
