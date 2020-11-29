//package CaseStudy.Main;
//
//import CaseStudy.Model.BO.M_Vehicle;
//import CaseStudy.Model.Entity.Car;
//import CaseStudy.Model.Entity.Data;
//import com.google.gson.Gson;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
////đọc ghi file vào file csv gồm 2 đối tượng là xe hơi và xe tải
//// ( cả 2 đều có các thuộc tính là màu sắc, khối lượng xe, mã xe, động cơ),
//// ngoài ra xe hơi có thêm thuộc tính là số ghế ngồi, có bánh dự phòng hay không? ),
//// xe tải có thêm thuộc tính ( chở gì, khối lượng hang cho phép).
//// Viết các phương thức Create, Read, Update,Delete.
//public class Main {
//    public static void main(String[] args) throws IOException {
////        Scanner sc = new Scanner(System.in);
////        int option;
////        do {
////            System.out.println("1. Add New Vehicle");
////            System.out.println("2. Display Vehicle");
////            System.out.println("3. Update Vehicle");
////            System.out.println("4. Delete Vehicle");
////            System.out.println("5. Exit");
////            System.out.println("--------------------");
////            System.out.println("Choose Option");
////            option = sc.nextInt();
////            switch(option){
////                case 1:
////                    AddVehicle();
////                    break;
////                case 2:
////                    Display();
////                case 3:
////                    Update();
////                case 4:
////                    Delete();
////
////            }
////        }
////        while (option!=5);
////        Car c1 = new Car("Red","1251",1234,2000,4,3);
////        Gson gson = new Gson();
////        ArrayList<Car> listCar = new ArrayList<>();
////        listCar.add(c1);
////        listCar.add(c1);
////        listCar.add(c1);
////        listCar.add(c1);
////        listCar.add(c1);
//
////        String t =gson.toJson(li);
////        System.out.println(t);
//        M_Vehicle m_vehicle = new M_Vehicle();
////        m_vehicle.SetListTruck();
//        m_vehicle.SetListCar();
//
//    }
//    public static void AddVehicle(){
//`
//        System.out.println("1. Add Car");
//        System.out.println("2. Add Truck");
//
//
//    }
//    public static void Display(){
//
//    }
//    public static void Update(){
//
//    }
//    public static void Delete(){
//
//    }
//}
