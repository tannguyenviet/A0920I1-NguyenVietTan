package BaiTapAnhHai.Controller;

import BaiTapAnhHai.BO.impl.BImpl_Truck;
import BaiTapAnhHai.Entity.Truck;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C_Truck {
//    private ArrayList<Truck> listTruck ;
    private BImpl_Truck bImpl_truck;
    public C_Truck() throws IOException {
        bImpl_truck = new BImpl_Truck();
    }
    public void printFormInput(){

    };

    public ArrayList<Truck> getListTruck() throws IOException {
        return bImpl_truck.getList();
    }



    public void insert() throws IOException {
        this.bImpl_truck.Insert();
    }
    public void view() throws IOException {
        this.bImpl_truck.view();
    }
    public void viewOneProduct(int index) throws IOException {
        this.bImpl_truck.getDetailTruck(index);
    }

    public void delete(int index) {

    }
}
