package BaiTapAnhHai.BO.impl;

import BaiTapAnhHai.BO.B_Truck;
import BaiTapAnhHai.DAO.Data;
import BaiTapAnhHai.Entity.Truck;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BImpl_Truck implements B_Truck {
    private Data data;
    private String path;
    public  BImpl_Truck(){
        this.data = new Data();
        this.path="./src/BaiTapAnhHai/FileData/Truck.txt";
    }
    public ArrayList<Truck> getList() throws IOException {

        String st =this.data.readFile(this.path);
        // Đọc da ta thành chuỗi String
        String[] lines = st.split(System.getProperty("line.separator"));
        ArrayList<Truck> listTruck = new ArrayList<>();
        for(int i =0;i<lines.length;i++) {
            Truck newTruck = new Truck();
            //
            String[] components = lines[i].split(",");
            newTruck.setName(components[0]);
            newTruck.setColor(components[1]);
            newTruck.setId(components[2]);
            newTruck.setWeight(Integer.parseInt(components[3]));
            newTruck.setStock(components[4]);
            newTruck.setLimitWeight(Integer.parseInt(components[5]));
            //-- Đọc và xử lí xâu
            listTruck.add(newTruck);
        }
        return listTruck;
    }

    @Override
    public Truck getDetailTruck(int index) throws IOException {
            return this.getList().get(index);
    }

    @Override
    public void Insert() throws IOException {
        String name;
        String color;
        String id;
        int weight;
        String stock;
        int limitWeight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập các thông số của Truck");
        System.out.println("Nhập tên: ");name = sc.nextLine();
        System.out.println("Nhập màu: ");color = sc.nextLine();
        System.out.println("Nhập id: ");id= sc.nextLine();
        System.out.println("Nhập cân nặng xe: ");weight= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập đồ tải: ");stock = (sc.nextLine());
        System.out.println("Nhập số tải trọng giới hạn ");limitWeight= Integer.parseInt(sc.nextLine());
        String st=name+","+color+","+id+","+weight+","+stock+","+limitWeight;
        System.out.println(st);
        data.writeFile(this.path,st);
    }
    public void view() throws IOException {
        String st =data.readFile(this.path);
        System.out.println(st);
    }

}
